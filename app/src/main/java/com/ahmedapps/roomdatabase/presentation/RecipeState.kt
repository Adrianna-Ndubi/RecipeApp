package com.ahmedapps.roomdatabase.presentation

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import com.ahmedapps.roomdatabase.data.Recipe

data class RecipeState(
    val recipes: List<Recipe> = emptyList(),
    val title: MutableState<String> = mutableStateOf(""),
    val time: MutableState<String> = mutableStateOf(""),
    val ingredients: MutableState<List<String>> = mutableStateOf(emptyList()),
    val instructions: MutableState<List<String>> = mutableStateOf(emptyList())
)
