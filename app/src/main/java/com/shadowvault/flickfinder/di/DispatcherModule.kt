package com.shadowvault.flickfinder.di

import kotlinx.coroutines.Dispatchers
import org.koin.core.qualifier.named
import org.koin.dsl.module

val dispatcherModule = module {
    single(named("DefaultDispatcher")) { Dispatchers.Default }
    single(named("IoDispatcher")) { Dispatchers.IO }
    single(named("MainDispatcher")) { Dispatchers.Main  }
    single(named("MainImmediateDispatcher")) { Dispatchers.Main.immediate }
}