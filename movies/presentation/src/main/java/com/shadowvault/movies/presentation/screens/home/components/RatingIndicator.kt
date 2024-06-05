package com.shadowvault.movies.presentation.screens.home.components

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun RatingIndicator(
    modifier: Modifier = Modifier,
    value: Double
) {
    val color = calculateColor(value)
    Box(
        modifier = modifier
            .size(96.dp),
        contentAlignment = Alignment.Center
    ) {
        Canvas(modifier = Modifier.size(48.dp)) {
            val strokeWidth = 4f
            val sweepAngle = (value / 10 * 360).toFloat()

            drawArc(
                color = Color.LightGray,
                startAngle = 0f,
                sweepAngle = 360f,
                useCenter = false,
                style = Stroke(width = strokeWidth, cap = StrokeCap.Round)
            )

            // Draw rating arc
            drawArc(
                color = color,
                startAngle = -90f,
                sweepAngle = sweepAngle,
                useCenter = false,
                style = Stroke(width = strokeWidth, cap = StrokeCap.Round)
            )
        }
        Text(
            text = value.toString(),
            style = TextStyle(fontSize = 14.sp),
            color = color
        )
    }
}

@Composable
private fun calculateColor(value: Double): Color {
    return when {
        value >= 7.0 -> Color.Green
        value >= 4.0 -> Color.Yellow
        else -> Color.Red
    }
}