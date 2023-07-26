package com.taokyone.noteintheapp.ui.screens.list

import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.taokyone.noteintheapp.ui.theme.topAbbBarBackgroundColor
import com.taokyone.noteintheapp.ui.theme.topAbbBarContentColor

@Composable
fun ListAppBar() {
    DefaultAppBar()
}

@Composable
fun DefaultAppBar() {
    TopAppBar(
        title = {
            Text(
                text = "Tasks",
                color = MaterialTheme.colors.topAbbBarContentColor
                )
        },
        backgroundColor = MaterialTheme.colors.topAbbBarBackgroundColor
    )
}

@Preview
@Composable
private fun DefaultListAppBarPreview() {
    DefaultAppBar()
}