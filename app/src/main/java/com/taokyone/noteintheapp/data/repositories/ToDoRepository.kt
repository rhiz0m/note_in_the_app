package com.taokyone.noteintheapp.data.repositories

import androidx.room.Query
import com.taokyone.noteintheapp.data.ToDoDao
import com.taokyone.noteintheapp.data.models.ToDoTasks
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

// Here we inject Dao
class ToDoRepository @Inject constructor(private val toDoDao: ToDoDao) {

    val getAllTasks: Flow<List<ToDoTasks>> = toDoDao.getAllTasks()
    val sortByLowPriority: Flow<List<ToDoTasks>> = toDoDao.sortByLowPriority()
    val sortByHighPriority: Flow<List<ToDoTasks>> = toDoDao.sortByHighPriority()

    // returning a flow and don't need suspend fun
    fun getSelectedTask(taskId: Int): Flow<ToDoTasks> {
        return toDoDao.getSelectedTask(taskId = taskId)
    }

    suspend fun addTask(toDoTasks: ToDoTasks) {
        toDoDao.addTask(toDoTasks = toDoTasks)
    }

    suspend fun updateTask(toDoTasks: ToDoTasks) {
        toDoDao.updateTask(toDoTasks = toDoTasks)
    }

    suspend fun deleteTask(toDoTasks: ToDoTasks) {
        toDoDao.deleteTask(toDoTasks = toDoTasks)
    }

    suspend fun deleteAllTAsks() {
        toDoDao.deleteAllTasks()
    }

    fun searchDatabase(searchQuery: String): Flow<List<ToDoTasks>> {
        return toDoDao.searchDatabase(searchQuery = searchQuery)
    }

}