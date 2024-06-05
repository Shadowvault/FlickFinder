package com.shadowvault.core.database.di

import androidx.room.Room
import com.shadowvault.core.database.MovieDatabase
import com.shadowvault.core.database.RoomMovieLocalDataSource
import com.shadowvault.movies.domain.LocalMoviesDataSource
import org.koin.android.ext.koin.androidApplication
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.bind
import org.koin.dsl.module

val databaseModule = module {
    single {
        Room.databaseBuilder(
            androidApplication(),
            MovieDatabase::class.java,
            "movie.db"
        ).build()
    }

    single { get<MovieDatabase>().movieDao }

    singleOf(::RoomMovieLocalDataSource).bind<LocalMoviesDataSource>()
}