package com.shadowvault.movies.presentation.screens.di

import com.shadowvault.movies.presentation.screens.home.HomeScreenViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.core.qualifier.named
import org.koin.dsl.module

val homeViewModelModule = module {
    viewModel {
        HomeScreenViewModel(
            remoteMoviesDataSource = get(),
            localMoviesDataSource = get(),
            dispatcher = get(named("IoDispatcher"))
        )
    }
}