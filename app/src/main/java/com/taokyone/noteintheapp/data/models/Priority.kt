package com.taokyone.noteintheapp.data.models


import androidx.compose.ui.graphics.Color
import com.taokyone.noteintheapp.ui.theme.highPriorityColor
import com.taokyone.noteintheapp.ui.theme.lowPriorityColor
import com.taokyone.noteintheapp.ui.theme.mediumPriorityColor
import com.taokyone.noteintheapp.ui.theme.nonePriorityColor

enum class Priority(val color: Color) {
    HIGH(highPriorityColor),
    MEDIUM(mediumPriorityColor),
    LOW(lowPriorityColor),
    NONE(nonePriorityColor)
}