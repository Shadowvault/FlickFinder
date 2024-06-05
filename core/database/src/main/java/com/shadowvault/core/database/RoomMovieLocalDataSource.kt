package com.shadowvault.core.database

import android.database.sqlite.SQLiteFullException
import com.shadowvault.core.database.dao.MovieDao
import com.shadowvault.core.database.mappers.toMovie
import com.shadowvault.core.database.mappers.toMovieEntity
import com.shadowvault.core.domain.util.DataError
import com.shadowvault.core.domain.util.Result
import com.shadowvault.movies.domain.LocalMoviesDataSource
import com.shadowvault.movies.domain.Movie
import com.shadowvault.movies.domain.MovieId
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map

class RoomMovieLocalDataSource(
    private val movieDao: MovieDao
) : LocalMoviesDataSource {
    override suspend fun upsertMovie(movie: Movie): Result<MovieId, DataError.Local> {
        return try {
            movieDao.upsertMovie(movie.toMovieEntity())
            Result.Success(movie.id)
        } catch (e: SQLiteFullException) {
            Result.Error(DataError.Local.DISK_FULL)
        }
    }

    override suspend fun deleteMovie(id: Int) {
        movieDao.deleteMovie(id)
    }

    override fun getMovies(): Flow<List<Movie>> {
        return movieDao.getMovies().map { movieEntities -> movieEntities.map { it.toMovie() } }
    }
}