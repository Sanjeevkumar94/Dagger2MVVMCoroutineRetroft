package com.example.dagger2mvvmcoroutineretroft

import android.app.Application
import com.example.dagger2mvvmcoroutineretroft.di.ApplicationComponent
import com.example.dagger2mvvmcoroutineretroft.di.DaggerApplicationComponent

class FakerApplication:Application() {


    lateinit var applicationComponent: ApplicationComponent

    override fun onCreate() {
        super.onCreate()

        applicationComponent = DaggerApplicationComponent.factory().create(this)

    }
}