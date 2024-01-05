package com.ahmedapps.roomdatabase.presentation

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Add
import androidx.compose.material.icons.rounded.Delete
import androidx.compose.material.icons.rounded.Info
import androidx.compose.material.icons.rounded.Sort
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.window.Dialog
import androidx.navigation.NavController
import com.ahmedapps.roomdatabase.R
import com.ahmedapps.roomdatabase.data.Recipe

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun RecipesScreen(
    state: RecipeState,
    navController: NavController,
    onEvent: (RecipesEvent) -> Unit,
    onItemClick: (String) -> Unit

) {

    Scaffold(
        topBar = {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(55.dp)
                    .background(MaterialTheme.colorScheme.primary)
                    .padding(16.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    text = stringResource(id = R.string.app_name),
                    modifier = Modifier.weight(1f),
                    fontSize = 17.sp,
                    fontWeight = FontWeight.SemiBold,
                    color = MaterialTheme.colorScheme.onPrimary
                )

                IconButton(onClick = { onEvent(RecipesEvent.SortRecipes) }) {
                    Icon(
                        imageVector = Icons.Rounded.Sort,
                        contentDescription = "Sort Recipes",
                        modifier = Modifier.size(35.dp),
                        tint = MaterialTheme.colorScheme.onPrimary
                    )
                }
            }
        },

        floatingActionButton = {
            FloatingActionButton(onClick = {
                state.title.value = ""
                state.time.value = ""
                state.ingredients.value = emptyList()
                state.instructions.value = emptyList()
                navController.navigate("AddRecipeScreen")
            }) {
                Icon(imageVector = Icons.Rounded.Add, contentDescription = "Add new recipe")
            }
        }
    ) { paddingValues ->

        LazyColumn(
            contentPadding = paddingValues,
            modifier = Modifier
                .fillMaxSize()
                .padding(8.dp),
            verticalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            items(state.recipes.size) { index ->
                RecipeItem(
                    state = state,
                    index = index,
                    onEvent = onEvent,
                    onItemClick = onItemClick
                )
            }
        }


    }

}

@Composable
fun RecipeItem(
    state: RecipeState,
    index: Int,
    onEvent: (RecipesEvent) -> Unit,
    onItemClick: (String) -> Unit
) {
    var isDialogOpen by remember { mutableStateOf(false) }

    Row(
        modifier = Modifier
            .fillMaxWidth()
            .clip(RoundedCornerShape(10.dp))
            .background(MaterialTheme.colorScheme.primaryContainer)
            .padding(12.dp)
    ) {
        Column(
            modifier = Modifier.weight(1f)
        ) {

            Text(
                text = state.recipes[index].title,
                fontSize = 18.sp,
                fontWeight = FontWeight.SemiBold,
                color = MaterialTheme.colorScheme.onSecondaryContainer
            )

            Spacer(modifier = Modifier.height(8.dp))

            Text(
                text = state.recipes[index].time,
                fontSize = 16.sp,
                color = MaterialTheme.colorScheme.onSecondaryContainer
            )

        }

        IconButton(
            onClick = {
                onEvent(RecipesEvent.DeleteRecipe(state.recipes[index]))
            }
        ) {

            Icon(
                imageVector = Icons.Rounded.Delete,
                contentDescription = "Delete Recipe",
                modifier = Modifier.size(35.dp),
                tint = MaterialTheme.colorScheme.onPrimaryContainer
            )

        }
        IconButton(
            onClick = {
                isDialogOpen = true
            }
        ) {
            Icon(
                imageVector = Icons.Rounded.Info,
                contentDescription = "View Recipe Details",
                modifier = Modifier.size(35.dp),
                tint = MaterialTheme.colorScheme.onPrimaryContainer
            )
        }

        if (isDialogOpen) {
            RecipeDetailsDialog(
                recipe = state.recipes[index],
                onDismiss = { isDialogOpen = false }
            )
        }

    }
}


@Composable
fun RecipeDetailsDialog(recipe: Recipe, onDismiss: () -> Unit) {
    Dialog(
        onDismissRequest = { onDismiss() },
        content = {
            // Content of the dialog with detailed recipe information
            Column(
                modifier = Modifier
                    .padding(16.dp)
                    .fillMaxWidth()
            ) {
                Text(text = "Title: ${recipe.title}")
                Spacer(modifier = Modifier.height(8.dp))
                Text(text = "Time: ${recipe.time}")
                Spacer(modifier = Modifier.height(16.dp))
                IngredientsSection(ingredients = recipe.ingredients)
                Spacer(modifier = Modifier.height(16.dp))
                InstructionsSection(instructions = recipe.instructions)
            }
        }
    )
}

@Composable
fun IngredientsSection(ingredients: List<String>) {
    Text(
        text = "Ingredients",
        fontWeight = FontWeight.Bold,
        textDecoration = TextDecoration.Underline
    )
    ingredients.forEach { ingredient ->
        Text(text = "- $ingredient")
    }
}

@Composable
fun InstructionsSection(instructions: List<String>) {
    Text(
        text = "Instructions",
        fontWeight = FontWeight.Bold,
        textDecoration = TextDecoration.Underline
    )
    instructions.forEach { instruction ->
        Text(text = "- $instruction")
    }
}
