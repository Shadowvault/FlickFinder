package com.shadowvault.movies.data.remote.dtos.reviews

import kotlinx.serialization.Serializable

@Serializable
data class AuthorDetailsDto(
    val avatar_path: String,
    val name: String,
    val rating: Int,
    val username: String
)