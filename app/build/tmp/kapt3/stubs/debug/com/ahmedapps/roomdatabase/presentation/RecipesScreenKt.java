package com.ahmedapps.roomdatabase.presentation;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 2, d1 = {"\u0000@\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u001a\u0016\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0007\u001a\u0016\u0010\u0005\u001a\u00020\u00012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0007\u001a\u001e\u0010\u0007\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00010\u000bH\u0007\u001a@\u0010\f\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00010\u00122\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u0012H\u0007\u001a@\u0010\u0015\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u00172\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00010\u00122\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u0012H\u0007\u00a8\u0006\u0018"}, d2 = {"IngredientsSection", "", "ingredients", "", "", "InstructionsSection", "instructions", "RecipeDetailsDialog", "recipe", "Lcom/ahmedapps/roomdatabase/data/Recipe;", "onDismiss", "Lkotlin/Function0;", "RecipeItem", "state", "Lcom/ahmedapps/roomdatabase/presentation/RecipeState;", "index", "", "onEvent", "Lkotlin/Function1;", "Lcom/ahmedapps/roomdatabase/presentation/RecipesEvent;", "onItemClick", "RecipesScreen", "navController", "Landroidx/navigation/NavController;", "app_debug"})
public final class RecipesScreenKt {
    
    @androidx.compose.runtime.Composable
    @kotlin.OptIn(markerClass = {androidx.compose.material3.ExperimentalMaterial3Api.class})
    public static final void RecipesScreen(@org.jetbrains.annotations.NotNull
    com.ahmedapps.roomdatabase.presentation.RecipeState state, @org.jetbrains.annotations.NotNull
    androidx.navigation.NavController navController, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super com.ahmedapps.roomdatabase.presentation.RecipesEvent, kotlin.Unit> onEvent, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> onItemClick) {
    }
    
    @androidx.compose.runtime.Composable
    public static final void RecipeItem(@org.jetbrains.annotations.NotNull
    com.ahmedapps.roomdatabase.presentation.RecipeState state, int index, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super com.ahmedapps.roomdatabase.presentation.RecipesEvent, kotlin.Unit> onEvent, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> onItemClick) {
    }
    
    @androidx.compose.runtime.Composable
    public static final void RecipeDetailsDialog(@org.jetbrains.annotations.NotNull
    com.ahmedapps.roomdatabase.data.Recipe recipe, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function0<kotlin.Unit> onDismiss) {
    }
    
    @androidx.compose.runtime.Composable
    public static final void IngredientsSection(@org.jetbrains.annotations.NotNull
    java.util.List<java.lang.String> ingredients) {
    }
    
    @androidx.compose.runtime.Composable
    public static final void InstructionsSection(@org.jetbrains.annotations.NotNull
    java.util.List<java.lang.String> instructions) {
    }
}