package com.example.lovecalculator.data.db.daos

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.lovecalculator.data.db.model.HistoryModel

@Dao
interface HistoryDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertNote(noteModel: HistoryModel)

    @Query("SELECT * FROM noteModel")
    fun getAll(): LiveData<List<HistoryModel>>
}