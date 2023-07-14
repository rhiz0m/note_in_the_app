package com.taokyone.noteintheapp

import androidx.room.Database
import androidx.room.RoomDatabase
import com.taokyone.noteintheapp.data.ToDoDao
import com.taokyone.noteintheapp.data.models.ToDoTasks

@Database(entities = [ToDoTasks::class], version = 1)
abstract class ToDoDatabase : RoomDatabase() {
    abstract fun toDoDao(): ToDoDao
}