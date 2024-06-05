package com.shadowvault.movies.presentation.screens.home.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.outlined.FavoriteBorder
import androidx.compose.material3.Icon
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.shadowvault.core.presentation.designsystem.FlickFinderTheme

@Composable
fun LikeButton(modifier: Modifier = Modifier, isFilled: Boolean, onClick: () -> Unit) {
    Box(
        modifier = modifier
            .padding(8.dp)
            .clip(CircleShape)
            .clickable(onClick = onClick),
    ) {
        if (isFilled) {
            Icon(
                imageVector = Icons.Filled.Favorite,
                contentDescription = "Filled Heart Icon",
                modifier = Modifier.size(24.dp)
            )
        } else {
            Icon(
                imageVector = Icons.Outlined.FavoriteBorder,
                contentDescription = "Outlined Heart Icon",
                modifier = Modifier.size(24.dp)
            )
        }
    }
}

@Preview
@Composable
fun LikeButtonPreview() {
    LikeButton(
        isFilled = false,
        onClick = {}
    )
}