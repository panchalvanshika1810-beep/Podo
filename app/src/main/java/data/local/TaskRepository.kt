package com.example.productivity.data

import com.example.productivity.data.local.dao.TaskDao
import com.example.productivity.data.local.entity.Task

class TaskRepository(private val taskDao: TaskDao) {

    suspend fun insert(task: Task) {
        taskDao.insert(task)
    }

    suspend fun getTasks(): List<Task> {
        return taskDao.getAllTasks()
    }
}