package com.example.productivity.ui

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.productivity.data.TaskRepository
import com.example.productivity.data.local.entity.Task
import kotlinx.coroutines.launch

class TaskViewModel(private val repository: TaskRepository) : ViewModel() {

    fun addTask(title: String, description: String) {
        viewModelScope.launch {
            repository.insert(Task(title = title, description = description))
        }
    }

    fun getTasks(onResult: (List<Task>) -> Unit) {
        viewModelScope.launch {
            val tasks = repository.getTasks()
            onResult(tasks)
        }
    }
}