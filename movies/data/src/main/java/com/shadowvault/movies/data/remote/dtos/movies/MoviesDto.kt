package com.shadowvault.movies.data.remote.dtos.movies

import kotlinx.serialization.Serializable

@Serializable
data class MoviesDto(
    val page: Int,
    val results: List<MovieDto>,
    val total_pages: Int,
    val total_results: Int
)