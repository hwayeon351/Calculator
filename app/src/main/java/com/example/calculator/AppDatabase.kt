package com.example.calculator

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.calculator.dao.HistoryDao
import com.example.calculator.model.History

//데이터베이스 선언
@Database(entities = [History::class], version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun historyDao(): HistoryDao
}