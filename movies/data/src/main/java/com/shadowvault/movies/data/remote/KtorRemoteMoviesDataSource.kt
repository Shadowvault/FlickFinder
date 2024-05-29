package com.shadowvault.movies.data.remote

import com.shadowvault.core.data.networking.get
import com.shadowvault.core.domain.util.DataError
import com.shadowvault.core.domain.util.Result
import com.shadowvault.core.domain.util.map
import com.shadowvault.movies.data.remote.dtos.details.MovieDetailsDto
import com.shadowvault.movies.data.remote.dtos.details.toMovieDetails
import com.shadowvault.movies.data.remote.dtos.movies.MoviesDto
import com.shadowvault.movies.data.remote.dtos.movies.toMovie
import com.shadowvault.movies.data.remote.dtos.reviews.MovieReviewsDto
import com.shadowvault.movies.data.remote.dtos.reviews.ReviewDto
import com.shadowvault.movies.data.remote.dtos.reviews.toReview
import com.shadowvault.movies.domain.Details
import com.shadowvault.movies.domain.Movie
import com.shadowvault.movies.domain.RemoteMoviesDataSource
import com.shadowvault.movies.domain.Review
import io.ktor.client.HttpClient

class KtorRemoteMoviesDataSource(
    private val httpClient: HttpClient
) : RemoteMoviesDataSource {
    override suspend fun getPopularMovies(page: Int): Result<List<Movie>, DataError.Network> {
        return httpClient.get<MoviesDto>("discover/movie", queryParameters = mapOf("page" to page)).map { response ->
            response.results.map { movie -> movie.toMovie() }
        }
    }

    override suspend fun searchMovies(query: String): Result<List<Movie>, DataError.Network> {
        return httpClient.get<MoviesDto>("search/movie", mapOf("query" to query)).map { response ->
            response.results.map { movie -> movie.toMovie() }
        }
    }

    override suspend fun getMovieDetails(movieId: Int): Result<Details, DataError.Network> {
        return httpClient.get<MovieDetailsDto>("movie/${movieId}").map { detailsDto -> detailsDto.toMovieDetails()
        }
    }

    override suspend fun getMovieReviews(movieId: Int, page: Int): Result<List<Review>, DataError.Network> {
        return httpClient.get<MovieReviewsDto>("movie/${movieId}/reviews", queryParameters = mapOf("page" to page)).map { response ->
            response.results.map { reviewDto -> reviewDto.toReview() }
        }
    }

    override suspend fun getSimilarMovies(movieId: Int, page: Int): Result<List<Movie>, DataError.Network> {
        return httpClient.get<MoviesDto>("movie/${movieId}/similar", queryParameters = mapOf("page" to page)).map { response ->
            response.results.map { movie -> movie.toMovie() }
        }
    }

}