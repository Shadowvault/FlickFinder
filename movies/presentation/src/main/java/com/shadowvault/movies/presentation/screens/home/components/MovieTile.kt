package com.shadowvault.movies.presentation.screens.home.components

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.outlined.FavoriteBorder
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.rememberAsyncImagePainter
import com.shadowvault.movies.domain.Movie

@Composable
fun MovieTile(
    modifier: Modifier = Modifier,
    movie: Movie,
    onTileClick: () -> Unit,
    onLikeClick: () -> Unit
) {
    Card(modifier = modifier.clickable(onClick = onTileClick)) {
        Box {
            Image(
                painter = rememberAsyncImagePainter(model = "https://image.tmdb.org/t/p/w1280/" + movie.poster_path),
                contentDescription = null,
                modifier = modifier
                    .aspectRatio(9f / 16f),
                contentScale = ContentScale.Crop
            )
            LikeButton(modifier = Modifier.align(Alignment.TopEnd), isFilled = false, onClick = onLikeClick)
        }
    }
}

@Preview
@Composable
fun MovieTilePreview() {
    MovieTile(
        modifier = Modifier.fillMaxWidth(),
        movie = Movie(
            id = 1,
            title = "Kingdom of the Planet of the Apes",
            rating = 7.9,
            poster_path = "",
            release_date = "2024-05-08"
        ),
        onTileClick = {},
        onLikeClick = {}
    )
}