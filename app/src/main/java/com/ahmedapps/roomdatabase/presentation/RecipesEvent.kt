package com.ahmedapps.roomdatabase.presentation


import com.ahmedapps.roomdatabase.data.Recipe

sealed interface RecipesEvent{
    object SortRecipes: RecipesEvent

    data class DeleteRecipe(val recipe: Recipe): RecipesEvent

    data class SaveRecipe(
        val title: String,
        val time: String,
        val ingredients: List<String>,
        val instructions: List<String>,
    ): RecipesEvent

}