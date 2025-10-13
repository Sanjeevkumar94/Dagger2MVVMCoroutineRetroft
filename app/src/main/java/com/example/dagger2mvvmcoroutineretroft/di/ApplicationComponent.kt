package com.example.dagger2mvvmcoroutineretroft.di

import com.example.dagger2mvvmcoroutineretroft.MainActivity
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [NetworkModule::class])
interface ApplicationComponent {

    fun inject(mainActivity: MainActivity)

}