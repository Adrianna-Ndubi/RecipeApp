package com.ahmedapps.roomdatabase.presentation

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.ahmedapps.roomdatabase.data.Recipe
import com.ahmedapps.roomdatabase.data.RecipeDao
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.combine
import kotlinx.coroutines.flow.flatMapLatest
import kotlinx.coroutines.flow.stateIn
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class RecipesViewModel(
    private val dao: RecipeDao,
): ViewModel() {

    private val isSortedByDateAdded = MutableStateFlow(true)
    private var recipes = isSortedByDateAdded.flatMapLatest { sort ->
        if(sort){
            dao.getRecipesOrderByDateAdded()
        }else{
            dao.getRecipesOrderByTitle()
        }
    }.stateIn(viewModelScope, SharingStarted.WhileSubscribed(), emptyList())

    val _state = MutableStateFlow(RecipeState())
    val state = combine(_state, isSortedByDateAdded, recipes) {
            state, isSortedByDateAdded, recipes -> state.copy(
        recipes = recipes
    )
    }.stateIn(viewModelScope, SharingStarted.WhileSubscribed(5000), RecipeState())

    fun onEvent(event: RecipesEvent) {
        when (event) {
            is RecipesEvent.DeleteRecipe -> {
                viewModelScope.launch {
                    withContext(Dispatchers.IO) {
                        dao.deleteRecipe(event.recipe)
                    }
                }
            }

            is RecipesEvent.SaveRecipe -> {
                val recipe = Recipe(
                    title = state.value.title.value,
                    time = state.value.time.value,
                    ingredients = state.value.ingredients.value,
                    instructions = state.value.instructions.value,
                    dateAdded = System.currentTimeMillis(),
                )

                viewModelScope.launch {
                    withContext(Dispatchers.IO) {
                        dao.upsertRecipe(recipe)
                    }

                    _state.update {
                        it.copy(
                            recipes = emptyList(),
                            title = mutableStateOf(""),
                            time = mutableStateOf(""),
                            ingredients = mutableStateOf(emptyList()),
                            instructions = mutableStateOf(emptyList())
                        )
                    }
                }
            }

            RecipesEvent.SortRecipes -> {
                isSortedByDateAdded.value = !isSortedByDateAdded.value
            }
        }
    }

}