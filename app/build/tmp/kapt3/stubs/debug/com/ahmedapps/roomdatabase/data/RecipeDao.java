package com.ahmedapps.roomdatabase.data;

import java.lang.System;

@androidx.room.Dao
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u0014\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\b0\u0007H\'J\u0014\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\b0\u0007H\'J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'\u00a8\u0006\u000b"}, d2 = {"Lcom/ahmedapps/roomdatabase/data/RecipeDao;", "", "deleteRecipe", "", "recipe", "Lcom/ahmedapps/roomdatabase/data/Recipe;", "getRecipesOrderByDateAdded", "Lkotlinx/coroutines/flow/Flow;", "", "getRecipesOrderByTitle", "upsertRecipe", "app_debug"})
public abstract interface RecipeDao {
    
    @androidx.room.Upsert
    public abstract void upsertRecipe(@org.jetbrains.annotations.NotNull
    com.ahmedapps.roomdatabase.data.Recipe recipe);
    
    @androidx.room.Delete
    public abstract void deleteRecipe(@org.jetbrains.annotations.NotNull
    com.ahmedapps.roomdatabase.data.Recipe recipe);
    
    @org.jetbrains.annotations.NotNull
    @androidx.room.Query(value = "SELECT * FROM recipe ORDER BY dateAdded")
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.ahmedapps.roomdatabase.data.Recipe>> getRecipesOrderByDateAdded();
    
    @org.jetbrains.annotations.NotNull
    @androidx.room.Query(value = "SELECT * FROM recipe ORDER BY title ASC")
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.ahmedapps.roomdatabase.data.Recipe>> getRecipesOrderByTitle();
}