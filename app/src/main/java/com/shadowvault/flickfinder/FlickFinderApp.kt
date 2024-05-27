package com.shadowvault.flickfinder

import android.app.Application
import com.shadowvault.core.data.di.coreDataModule
import com.shadowvault.flickfinder.di.appModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin
import timber.log.Timber

class FlickFinderApp: Application() {
    override fun onCreate() {
        super.onCreate()
        if (BuildConfig.DEBUG) {
            Timber.plant(Timber.DebugTree())
        }

        startKoin {
            androidLogger()
            androidContext(this@FlickFinderApp)
            appModule
            coreDataModule
        }
    }
}