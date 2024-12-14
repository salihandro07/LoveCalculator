package com.example.lovecalculator.data.db.model

import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = "noteModel")
data class HistoryModel(
    val title: String,
    val description: String,
    val date: String,
    val time: String
) {
    @PrimaryKey(autoGenerate = true)
    var id: Int = 0
}
