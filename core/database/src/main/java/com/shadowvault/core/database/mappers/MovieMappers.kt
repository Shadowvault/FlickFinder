package com.shadowvault.core.database.mappers

import com.shadowvault.core.database.entity.MovieEntity
import com.shadowvault.movies.domain.Movie

fun Movie.toMovieEntity(): MovieEntity {
    return MovieEntity(
        id = id,
        isLiked = isLiked
    )
}

fun MovieEntity.toMovie(): Movie {
    return Movie(
        id = id,
        poster_path = "",
        release_date = "",
        title = "",
        rating = 0.0,
        isLiked = isLiked
    )
}