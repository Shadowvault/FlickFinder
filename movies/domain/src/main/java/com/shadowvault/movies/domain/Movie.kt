package com.shadowvault.movies.domain

data class Movie(
    val id: Int,
    val poster_path: String,
    val release_date: String,
    val title: String,
    val rating: Double,
    val isLiked: Boolean = false
)
