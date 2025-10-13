package com.example.dagger2mvvmcoroutineretroft.di

import com.example.dagger2mvvmcoroutineretroft.retrofit.FakeApi
import com.example.dagger2mvvmcoroutineretroft.utils.Constants
import com.google.gson.Gson
import dagger.Module
import dagger.Provides
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton


@Module
class NetworkModule {

    @Singleton
    @Provides
    fun providesRetrofit():Retrofit{
        return Retrofit.Builder().baseUrl(Constants.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    @Singleton
    @Provides
    fun providesFakerAPI(retrofit: Retrofit):FakeApi{
        return retrofit.create(FakeApi::class.java)
    }


}