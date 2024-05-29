package com.shadowvault.movies.data.remote.dtos.details

import kotlinx.serialization.Serializable

@Serializable
data class SpokenLanguageDto(
    val english_name: String,
    val iso_639_1: String,
    val name: String
)