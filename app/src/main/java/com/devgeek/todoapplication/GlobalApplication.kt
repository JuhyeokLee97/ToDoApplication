package com.devgeek.todoapplication

import android.app.Application
import com.devgeek.todoapplication.di.appModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin
import org.koin.core.logger.Level

class GlobalApplication: Application() {

    override fun onCreate() {
        super.onCreate()
        // todo Koin Trigger

        startKoin {
            androidLogger(Level.ERROR)
            androidContext(this@GlobalApplication)
            modules(appModule)
        }

    }
}