package com.taokyone.noteintheapp.ui.screens.list

import androidx.compose.material.FloatingActionButton
import androidx.compose.material.Icon
import androidx.compose.material.Scaffold
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.taokyone.noteintheapp.R


@Composable
fun listScreen(navigateToTaskScreen: (Int) -> Unit) {
    Scaffold(
        content = {it},
        floatingActionButton = {
            listFab(navigateToTaskScreen = navigateToTaskScreen)
        }
    )
}

@Composable
fun listFab(navigateToTaskScreen: (Int) -> Unit) {
      FloatingActionButton(onClick = {
            // -1 is the Int passed because we don't selecting any task
          navigateToTaskScreen(-1)
      }) {
          Icon(imageVector = Icons.Default.Add,
          contentDescription = stringResource(id = R.string.add_button)
          )
      }
}

@Preview
@Composable
private fun listScreenPreview() {
    listScreen(navigateToTaskScreen = {})
}