package com.shadowvault.flickfinder

import android.app.Application
import com.shadowvault.core.data.di.coreDataModule
import com.shadowvault.core.database.di.databaseModule
import com.shadowvault.flickfinder.di.appModule
import com.shadowvault.movies.data.remote.di.remoteMoviesModule
import com.shadowvault.movies.presentation.screens.di.homeViewModelModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin
import timber.log.Timber

class FlickFinderApp : Application() {
    override fun onCreate() {
        super.onCreate()
        if (BuildConfig.DEBUG) {
            Timber.plant(Timber.DebugTree())
        }

        startKoin {
            androidLogger()
            androidContext(this@FlickFinderApp)
            modules(
                appModule,
                coreDataModule,
                remoteMoviesModule,
                homeViewModelModule,
                databaseModule
            )
        }
    }
}