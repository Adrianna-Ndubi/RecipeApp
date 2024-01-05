package com.ahmedapps.roomdatabase.data

import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity
data class Recipe(
    val title: String,
    val time: String,
    val ingredients: List<String>,
    val instructions: List<String>,
    val dateAdded: Long,

    @PrimaryKey(autoGenerate = true)
    val id: Int = 0
)
