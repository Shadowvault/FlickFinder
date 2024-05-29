package com.shadowvault.movies.data.remote.dtos.details

import kotlinx.serialization.Serializable

@Serializable
data class ProductionCountryDto(
    val iso_3166_1: String,
    val name: String
)