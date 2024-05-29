package com.shadowvault.movies.data.remote.dtos.details

import kotlinx.serialization.Serializable

@Serializable
data class BelongsToCollectionDto(
    val backdrop_path: String,
    val id: Int,
    val name: String,
    val poster_path: String
)