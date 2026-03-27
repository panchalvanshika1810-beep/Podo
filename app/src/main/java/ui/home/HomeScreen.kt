package com.example.productivity.ui.home

import android.annotation.SuppressLint
import androidx.compose.runtime.*
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.*
import androidx.compose.ui.platform.LocalContext

import com.example.productivity.data.TaskRepository
import com.example.productivity.data.local.database.DatabaseProvider
import com.example.productivity.ui.TaskViewModel

@SuppressLint("ViewModelConstructorInComposable")
@Composable
fun HomeScreen() {

    val context = LocalContext.current

    //  Database
    val db = DatabaseProvider.getDatabase(context)

    //  Repository (IMPORTANT — you missed this earlier)
    val repository = TaskRepository(db.taskDao())

    //  ViewModel
    val viewModel = TaskViewModel(repository)

    //  State
    var tasks by remember { mutableStateOf(listOf<String>()) }

    //  Load tasks
    LaunchedEffect(Unit) {
        viewModel.getTasks {
            tasks = it.map { task -> task.title }
        }
    }

    Column {

        Button(onClick = {
            viewModel.addTask("Test Task", "Sample Description")
        }) {
            Text("Add Task")
        }

        tasks.forEach {
            Text(it)
        }
    }
}