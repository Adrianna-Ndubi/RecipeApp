package com.ahmedapps.roomdatabase.data;

import java.lang.System;

@androidx.room.TypeConverters(value = {com.ahmedapps.roomdatabase.data.Converters.class})
@androidx.room.Database(entities = {com.ahmedapps.roomdatabase.data.Recipe.class}, version = 2)
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&\u00a8\u0006\u0005"}, d2 = {"Lcom/ahmedapps/roomdatabase/data/RecipesDatabase;", "Landroidx/room/RoomDatabase;", "()V", "dao", "Lcom/ahmedapps/roomdatabase/data/RecipeDao;", "app_debug"})
public abstract class RecipesDatabase extends androidx.room.RoomDatabase {
    
    public RecipesDatabase() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public abstract com.ahmedapps.roomdatabase.data.RecipeDao dao();
}