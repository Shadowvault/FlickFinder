package com.shadowvault.movies.data.remote.dtos.reviews

import kotlinx.serialization.Serializable

@Serializable
data class MovieReviewsDto(
    val id: Int,
    val page: Int,
    val results: List<ReviewDto>,
    val total_pages: Int,
    val total_results: Int
)