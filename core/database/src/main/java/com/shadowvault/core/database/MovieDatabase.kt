package com.shadowvault.core.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.shadowvault.core.database.dao.MovieDao
import com.shadowvault.core.database.entity.MovieEntity

@Database(
    entities = [MovieEntity::class],
    version = 1
)
abstract class MovieDatabase: RoomDatabase() {
    abstract val movieDao: MovieDao
}