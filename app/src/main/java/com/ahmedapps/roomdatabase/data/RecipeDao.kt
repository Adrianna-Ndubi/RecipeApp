package com.ahmedapps.roomdatabase.data

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Query
import androidx.room.Upsert
import kotlinx.coroutines.flow.Flow
@Dao
interface RecipeDao {

    @Upsert
    fun upsertRecipe(recipe: Recipe)

    @Delete
    fun deleteRecipe(recipe: Recipe)

    @Query("SELECT * FROM recipe ORDER BY dateAdded")
    fun getRecipesOrderByDateAdded(): Flow<List<Recipe>>

    @Query("SELECT * FROM recipe ORDER BY title ASC")
    fun getRecipesOrderByTitle(): Flow<List<Recipe>>
}











