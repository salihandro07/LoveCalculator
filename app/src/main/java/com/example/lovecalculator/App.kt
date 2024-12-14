package com.example.lovecalculator

import android.app.Application
import androidx.room.Room
import com.example.lovecalculator.data.db.AppDatabase
import com.example.lovecalculator.ui.utils.PreferenceHelper

class App: Application(){
    companion object{
        var appDatabase: AppDatabase? = null
    }

    override fun onCreate() {
        super.onCreate()
        val sharedPreferences = PreferenceHelper()
        sharedPreferences.unit(this)
        getInstance()
    }

    private fun getInstance():AppDatabase? {
        if (appDatabase == null) {
            appDatabase = applicationContext?.let { context ->
                Room.databaseBuilder(
                    context,
                    AppDatabase::class.java, "database-name"
                ).allowMainThreadQueries().build()
            }
        }
        return appDatabase
    }
}