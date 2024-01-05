package com.ahmedapps.roomdatabase.presentation;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007\u00a8\u0006\b"}, d2 = {"Lcom/ahmedapps/roomdatabase/presentation/RecipesEvent;", "", "DeleteRecipe", "SaveRecipe", "SortRecipes", "Lcom/ahmedapps/roomdatabase/presentation/RecipesEvent$DeleteRecipe;", "Lcom/ahmedapps/roomdatabase/presentation/RecipesEvent$SaveRecipe;", "Lcom/ahmedapps/roomdatabase/presentation/RecipesEvent$SortRecipes;", "app_debug"})
public abstract interface RecipesEvent {
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/ahmedapps/roomdatabase/presentation/RecipesEvent$SortRecipes;", "Lcom/ahmedapps/roomdatabase/presentation/RecipesEvent;", "()V", "app_debug"})
    public static final class SortRecipes implements com.ahmedapps.roomdatabase.presentation.RecipesEvent {
        @org.jetbrains.annotations.NotNull
        public static final com.ahmedapps.roomdatabase.presentation.RecipesEvent.SortRecipes INSTANCE = null;
        
        private SortRecipes() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0011"}, d2 = {"Lcom/ahmedapps/roomdatabase/presentation/RecipesEvent$DeleteRecipe;", "Lcom/ahmedapps/roomdatabase/presentation/RecipesEvent;", "recipe", "Lcom/ahmedapps/roomdatabase/data/Recipe;", "(Lcom/ahmedapps/roomdatabase/data/Recipe;)V", "getRecipe", "()Lcom/ahmedapps/roomdatabase/data/Recipe;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "app_debug"})
    public static final class DeleteRecipe implements com.ahmedapps.roomdatabase.presentation.RecipesEvent {
        @org.jetbrains.annotations.NotNull
        private final com.ahmedapps.roomdatabase.data.Recipe recipe = null;
        
        @org.jetbrains.annotations.NotNull
        public final com.ahmedapps.roomdatabase.presentation.RecipesEvent.DeleteRecipe copy(@org.jetbrains.annotations.NotNull
        com.ahmedapps.roomdatabase.data.Recipe recipe) {
            return null;
        }
        
        @java.lang.Override
        public boolean equals(@org.jetbrains.annotations.Nullable
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override
        public int hashCode() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull
        @java.lang.Override
        public java.lang.String toString() {
            return null;
        }
        
        public DeleteRecipe(@org.jetbrains.annotations.NotNull
        com.ahmedapps.roomdatabase.data.Recipe recipe) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.ahmedapps.roomdatabase.data.Recipe component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.ahmedapps.roomdatabase.data.Recipe getRecipe() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006\u00a2\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0010\u001a\u00020\u0003H\u00c6\u0003J\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006H\u00c6\u0003J\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006H\u00c6\u0003J=\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00062\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006H\u00c6\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u00d6\u0003J\t\u0010\u0018\u001a\u00020\u0019H\u00d6\u0001J\t\u0010\u001a\u001a\u00020\u0003H\u00d6\u0001R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\r\u00a8\u0006\u001b"}, d2 = {"Lcom/ahmedapps/roomdatabase/presentation/RecipesEvent$SaveRecipe;", "Lcom/ahmedapps/roomdatabase/presentation/RecipesEvent;", "title", "", "time", "ingredients", "", "instructions", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;)V", "getIngredients", "()Ljava/util/List;", "getInstructions", "getTime", "()Ljava/lang/String;", "getTitle", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app_debug"})
    public static final class SaveRecipe implements com.ahmedapps.roomdatabase.presentation.RecipesEvent {
        @org.jetbrains.annotations.NotNull
        private final java.lang.String title = null;
        @org.jetbrains.annotations.NotNull
        private final java.lang.String time = null;
        @org.jetbrains.annotations.NotNull
        private final java.util.List<java.lang.String> ingredients = null;
        @org.jetbrains.annotations.NotNull
        private final java.util.List<java.lang.String> instructions = null;
        
        @org.jetbrains.annotations.NotNull
        public final com.ahmedapps.roomdatabase.presentation.RecipesEvent.SaveRecipe copy(@org.jetbrains.annotations.NotNull
        java.lang.String title, @org.jetbrains.annotations.NotNull
        java.lang.String time, @org.jetbrains.annotations.NotNull
        java.util.List<java.lang.String> ingredients, @org.jetbrains.annotations.NotNull
        java.util.List<java.lang.String> instructions) {
            return null;
        }
        
        @java.lang.Override
        public boolean equals(@org.jetbrains.annotations.Nullable
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override
        public int hashCode() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull
        @java.lang.Override
        public java.lang.String toString() {
            return null;
        }
        
        public SaveRecipe(@org.jetbrains.annotations.NotNull
        java.lang.String title, @org.jetbrains.annotations.NotNull
        java.lang.String time, @org.jetbrains.annotations.NotNull
        java.util.List<java.lang.String> ingredients, @org.jetbrains.annotations.NotNull
        java.util.List<java.lang.String> instructions) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String getTitle() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String getTime() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.util.List<java.lang.String> component3() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.util.List<java.lang.String> getIngredients() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.util.List<java.lang.String> component4() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.util.List<java.lang.String> getInstructions() {
            return null;
        }
    }
}