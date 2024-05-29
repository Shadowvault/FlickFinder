package com.shadowvault.movies.data.remote.dtos.movies

import com.shadowvault.movies.domain.Movie
import kotlinx.serialization.Serializable

@Serializable
data class MovieDto(
    val adult: Boolean,
    val backdrop_path: String,
    val genre_ids: List<Int>,
    val id: Int,
    val original_language: String,
    val original_title: String,
    val overview: String,
    val popularity: Double,
    val poster_path: String,
    val release_date: String,
    val title: String,
    val video: Boolean,
    val vote_average: Double,
    val vote_count: Int
)

fun MovieDto.toMovie() : Movie {
    return Movie (
        id = id,
        backdrop_path = backdrop_path,
        title = title,
        original_title = original_title,
        poster_path = poster_path,
        popularity = popularity,
        vote_average = vote_average,
        vote_count = vote_count,
        release_date = release_date
    )
}