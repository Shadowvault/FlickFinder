package com.shadowvault.core.database.dao

import androidx.room.Dao
import androidx.room.Query
import androidx.room.Upsert
import com.shadowvault.core.database.entity.MovieEntity
import kotlinx.coroutines.flow.Flow

@Dao
interface MovieDao {

    @Upsert
    suspend fun upsertMovie(movie: MovieEntity)

    @Query("DELETE FROM movieentity WHERE id=:id")
    suspend fun deleteMovie(id: Int)

    @Query("SELECT * FROM movieentity")
    fun getMovies(): Flow<List<MovieEntity>>
}