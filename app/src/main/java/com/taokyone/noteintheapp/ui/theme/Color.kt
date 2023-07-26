package com.taokyone.noteintheapp.ui.theme

import androidx.compose.material.Colors
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

val Purple200 = Color(0xFFBB86FC)
val Purple500 = Color(0xFF6200EE)
val Purple700 = Color(0xFF3700B3)
val Teal200 = Color(0xFF03DAC5)

val highPriorityColor = Color(0xFFF14545)
val mediumPriorityColor = Color(0xFFF1AB45)
val lowPriorityColor = Color(0xFF45F162)
val nonePriorityColor = Color(0xFFFFFFFF)

val LightGray = Color(0xFFFCFCFC)
val MediumGray = Color(0xFF9C9C9C)
val DarkGray = Color(0xFF141414)


// Settings for Dark mode. Created a custom getter
val Colors.topAbbBarContentColor: Color
@Composable
get() = if(isLight) Color.White else LightGray

val Colors.topAbbBarBackgroundColor: Color
    @Composable
    get() = if(isLight) Purple500 else Color.Black