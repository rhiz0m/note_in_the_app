package com.taokyone.noteintheapp.navigation

import androidx.navigation.NavHostController
import com.taokyone.noteintheapp.utils.Action
import com.taokyone.noteintheapp.utils.Constants.LIST_SCREEN

class Screens(navController : NavHostController) {
    // will take action that we will pass from our task composable. THen take that action to navigate to the list composable.

    val list: (Action) -> Unit = { action ->
        navController.navigate("list/${action.name}") {
            popUpTo(LIST_SCREEN) { inclusive = true}
        }
    }
    val task: (Int) -> Unit = { taskId ->
        navController.navigate("task/$taskId")
    }
}

// Don't put anything inside the NavOptionsBuilder because when we go from our list screen to our task screen
// We don't wanna popOf our list screen from the backstack