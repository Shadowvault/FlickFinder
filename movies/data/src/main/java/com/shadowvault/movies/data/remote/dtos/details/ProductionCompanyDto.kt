package com.shadowvault.movies.data.remote.dtos.details

import kotlinx.serialization.Serializable

@Serializable
data class ProductionCompanyDto(
    val id: Int,
    val logo_path: String,
    val name: String,
    val origin_country: String
)