package com.shadowvault.movies.domain

import com.shadowvault.core.domain.util.DataError
import com.shadowvault.core.domain.util.Result

interface RemoteMoviesDataSource {
    suspend fun getPopularMovies(page: Int): Result<List<Movie>, DataError.Network>
    suspend fun searchMovies(query: String): Result<List<Movie>, DataError.Network>
    suspend fun getMovieDetails(movieId: Int): Result<Details, DataError.Network>
    suspend fun getMovieReviews(movieId: Int, page: Int): Result<List<Review>, DataError.Network>
    suspend fun getSimilarMovies(movieId: Int, page: Int): Result<List<Movie>, DataError.Network>
}