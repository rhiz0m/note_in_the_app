package com.taokyone.noteintheapp.navigation.destinations

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavType
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import com.taokyone.noteintheapp.ui.screens.list.listScreen
import com.taokyone.noteintheapp.utils.Constants.LIST_ARGUMENT_KEY
import com.taokyone.noteintheapp.utils.Constants.LIST_SCREEN

fun NavGraphBuilder.listComposable(
    navigateToTaskScreen: (Int) -> Unit
) {
    composable(
        route = LIST_SCREEN,
        arguments = listOf(navArgument(LIST_ARGUMENT_KEY) {
            type = NavType.StringType
        })
    ) {
        listScreen(navigateToTaskScreen = navigateToTaskScreen)
    }
}