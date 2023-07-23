package com.taokyone.noteintheapp.navigation


import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import com.taokyone.noteintheapp.navigation.destinations.listComposable
import com.taokyone.noteintheapp.navigation.destinations.taskComposable
import com.taokyone.noteintheapp.utils.Constants.LIST_SCREEN

@Composable
fun SetupNavigation(
    navController: NavHostController
) {
    val screen = remember(navController) {
        Screens(navController = navController)
    }

    NavHost(
        navController = navController,
        startDestination = LIST_SCREEN) {
            listComposable(
                navigateToTaskScreen = screen.task
            )
            taskComposable(
                navigateToListScreen = screen.list
            )
    }
}