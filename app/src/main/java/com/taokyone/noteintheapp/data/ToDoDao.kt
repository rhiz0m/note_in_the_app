package com.taokyone.noteintheapp.data

import androidx.room.*
import com.taokyone.noteintheapp.data.models.ToDoTasks
import kotlinx.coroutines.flow.Flow

@Dao
interface ToDoDao {

    // Select all tasks from the database and sort all ToDoTasks in ascending order
    @Query("SELECT * FROM todo_table ORDER BY id ASC")
    fun getAllTasks() : Flow<List<ToDoTasks>>

    // Get a single task
    @Query("SELECT * FROM todo_table WHERE id=:taskId")
    fun getSelectedTask(taskId: Int) : Flow<ToDoTasks>

    // All that don't use FLOW should use the suspend Keyword
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun addTask(toDoTasks: ToDoTasks)

    @Update
    suspend fun updateTask(toDoTasks: ToDoTasks)

    @Delete
    suspend fun deleteTask(toDoTasks: ToDoTasks)

    @Query("DELETE FROM todo_table")
    suspend fun deleteAllTasks()

    @Query("SELECT * FROM todo_table WHERE title LIKE :searchQuery OR description LIKE :searchQuery")
    fun searchDatabase(searchQuery: String) : Flow<List<ToDoTasks>>

    @Query("SELECT * FROM todo_table ORDER BY CASE WHEN priority LIKE 'L%' THEN 1 WHEN priority LIKE 'M%' THEN 2 WHEN 'H%' THEN 3 END ")
    fun sortByLowPriority() : Flow<List<ToDoTasks>>

    @Query("SELECT * FROM todo_table ORDER BY CASE WHEN priority LIKE 'H%' THEN 1 WHEN priority LIKE 'M%' THEN 2 WHEN 'L%' THEN 3 END ")
    fun sortByHighPriority() : Flow<List<ToDoTasks>>


}