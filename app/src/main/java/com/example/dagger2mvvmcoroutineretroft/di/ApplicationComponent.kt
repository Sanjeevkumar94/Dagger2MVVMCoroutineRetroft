package com.example.dagger2mvvmcoroutineretroft.di

import android.content.Context
import com.example.dagger2mvvmcoroutineretroft.MainActivity
import dagger.Binds
import dagger.BindsInstance
import dagger.Component
import dagger.Component.Factory
import javax.inject.Singleton

@Singleton
@Component(modules = [NetworkModule::class,DatabaseModule::class])
interface ApplicationComponent {

    fun inject(mainActivity: MainActivity)


    @Component.Factory
    interface Factory{
        fun create(@BindsInstance context: Context):ApplicationComponent
    }
}