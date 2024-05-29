package com.shadowvault.movies.data.remote.di

import com.shadowvault.movies.data.remote.KtorRemoteMoviesDataSource
import com.shadowvault.movies.domain.RemoteMoviesDataSource
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.module
import org.koin.dsl.bind

val remoteMoviesModule = module {
    singleOf(::KtorRemoteMoviesDataSource).bind<RemoteMoviesDataSource>()
}