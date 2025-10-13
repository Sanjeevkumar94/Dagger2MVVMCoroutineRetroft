package com.example.dagger2mvvmcoroutineretroft.retrofit

import com.example.dagger2mvvmcoroutineretroft.models.Product
import retrofit2.Response
import retrofit2.http.GET

interface FakeApi {

    @GET("products")
    suspend fun getProducts() : Response<List<Product>>
}