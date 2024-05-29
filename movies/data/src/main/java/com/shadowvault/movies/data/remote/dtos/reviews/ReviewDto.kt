package com.shadowvault.movies.data.remote.dtos.reviews

import com.shadowvault.movies.domain.Review
import kotlinx.serialization.Serializable

@Serializable
data class ReviewDto(
    val author: String,
    val author_details: AuthorDetailsDto,
    val content: String,
    val created_at: String,
    val id: String,
    val updated_at: String,
    val url: String
)

fun ReviewDto.toReview(): Review {
    return Review(
        author = author,
        id = id,
        content = content
    )

}