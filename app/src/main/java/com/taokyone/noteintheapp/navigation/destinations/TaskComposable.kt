package com.taokyone.noteintheapp.navigation.destinations

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavType
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import com.taokyone.noteintheapp.utils.Action
import com.taokyone.noteintheapp.utils.Constants.LIST_ARGUMENT_KEY
import com.taokyone.noteintheapp.utils.Constants.LIST_SCREEN
import com.taokyone.noteintheapp.utils.Constants.TASK_ARGUMENT_KEY
import com.taokyone.noteintheapp.utils.Constants.TASK_SCREEN

fun NavGraphBuilder.taskComposable(
    navigateToListScreen: (Action) -> Unit
) {
    composable(
        route = TASK_SCREEN,
        arguments = listOf(navArgument(TASK_ARGUMENT_KEY) {
            type = NavType.IntType
        })
    ) {

    }
}