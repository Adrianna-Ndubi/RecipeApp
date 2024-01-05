package com.ahmedapps.roomdatabase

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.room.Room
import com.ahmedapps.roomdatabase.data.RecipesDatabase
import com.ahmedapps.roomdatabase.presentation.AddRecipeScreen
import com.ahmedapps.roomdatabase.presentation.RecipesScreen
import com.ahmedapps.roomdatabase.presentation.RecipesViewModel
import com.ahmedapps.roomdatabase.ui.theme.RoomDatabaseTheme

class MainActivity : ComponentActivity() {

    private val database by lazy {
        Room.databaseBuilder(
            applicationContext,
            RecipesDatabase::class.java,
            "recipes.db"
        ).build()
    }

    private val viewModel by viewModels<RecipesViewModel> (
        factoryProducer = {
            object : ViewModelProvider.Factory {
                override fun<T: ViewModel> create(modelClass: Class<T>): T {
                    return RecipesViewModel(database.dao()) as T
                }
            }
        }
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            RoomDatabaseTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {

                    val state by viewModel.state.collectAsState()
                    val navController = rememberNavController()

                    NavHost(navController= navController, startDestination = "SplashScreen") {
                        composable("SplashScreen") {
                            SplashScreen {
                                navController.navigate("RecipesScreen")
                            }
                        }
                        composable("RecipesScreen") {
                            RecipesScreen(
                                state = state,
                                navController = navController,
                                onEvent = viewModel::onEvent,
                                onItemClick = { recipeId ->
                                    navController.navigate("ViewRecipeScreen/$recipeId")
                                }
                            )
                        }
                        composable("AddRecipeScreen") {
                            AddRecipeScreen(
                                state = state,
                                navController = navController,
                                onEvent = viewModel::onEvent
                            )
                        }
                    }

                }
            }
        }
    }
}

// Add this function outside your MainActivity class
@Composable
fun SplashScreen(onClick: () -> Unit) {
    // Your splash screen UI goes here
    // You can use the Material components like Text, Button, etc.
    // Example:
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "Welcome to the Room Database!")
        Spacer(modifier = Modifier.height(16.dp))
        Button(onClick = onClick) {
            Text(text = "Continue to Home")
        }
    }
}
