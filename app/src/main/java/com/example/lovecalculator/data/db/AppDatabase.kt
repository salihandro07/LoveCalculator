package com.example.lovecalculator.data.db

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.lovecalculator.data.db.daos.HistoryDao
import com.example.lovecalculator.data.db.model.HistoryModel

@Database(entities = [HistoryModel::class], version = 1)
abstract class AppDatabase: RoomDatabase() {
    abstract fun noteDao(): HistoryDao
}