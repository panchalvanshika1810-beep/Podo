package com.example.productivity.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable

import com.example.productivity.ui.home.HomeScreen
import com.example.productivity.ui.timeblock.TimeBlockScreen

@Composable
fun AppNavGraph(
    navController: NavHostController,
    modifier: Modifier = Modifier
) {
    NavHost(
        navController = navController,
        startDestination = "home",
        modifier = modifier
    ) {

        composable("home") {
            HomeScreen()
        }

        composable("timeblock") {
            TimeBlockScreen()
        }
    }
}