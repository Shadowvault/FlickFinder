package com.shadowvault.movies.domain

import com.shadowvault.core.domain.util.DataError
import com.shadowvault.core.domain.util.Result
import kotlinx.coroutines.flow.Flow


typealias MovieId = Int

interface LocalMoviesDataSource {

    suspend fun upsertMovie(movie: Movie): Result<MovieId, DataError.Local>

    suspend fun deleteMovie(id: Int)

    fun getMovies(): Flow<List<Movie>>
}