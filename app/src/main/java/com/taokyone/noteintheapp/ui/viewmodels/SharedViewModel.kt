package com.taokyone.noteintheapp.ui.viewmodels

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.taokyone.noteintheapp.data.models.ToDoTasks
import com.taokyone.noteintheapp.data.repositories.ToDoRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch
import javax.inject.Inject

// Created shareModel and Injected our TodoRepository inside it.

@HiltViewModel
class SharedViewModel @Inject constructor (
    private val repository: ToDoRepository) : ViewModel() {

        private val _allTasks =
            MutableStateFlow<List<ToDoTasks>>(emptyList())

        // allTasks is publicly exposed to composable and get notified by our composable whenever the variable: _allTasks changes.
        val allTasks: StateFlow<List<ToDoTasks>> = _allTasks



    // Function fetch all functions from our todo_table (database)
        fun getAllTasks() {
            viewModelScope.launch() {
                repository.getAllTasks.collect() {
                    _allTasks.value = it
                }
            }
        }
}