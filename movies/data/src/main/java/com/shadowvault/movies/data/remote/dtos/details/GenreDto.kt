package com.shadowvault.movies.data.remote.dtos.details

import kotlinx.serialization.Serializable

@Serializable
data class GenreDto(
    val id: Int,
    val name: String
)