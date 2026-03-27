package com.example.productivity.data.local.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.productivity.data.local.dao.TaskDao
import com.example.productivity.data.local.entity.Task

@Database(entities = [Task::class], version = 1)
abstract class AppDatabase : RoomDatabase() {

    abstract fun taskDao(): TaskDao
}