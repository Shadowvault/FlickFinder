package com.shadowvault.movies.domain

data class Details(
    val backdrop_path: String,
    val genres: List<String>,
    val id: Int,
    val original_title: String,
    val overview: String,
    val popularity: Double,
    val poster_path: String,
    val release_date: String,
    val vote_average: Double,
    val vote_count: Int
)
