package com.example.dagger2mvvmcoroutineretroft.repository

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.dagger2mvvmcoroutineretroft.db.FakerDB
import com.example.dagger2mvvmcoroutineretroft.models.Product
import com.example.dagger2mvvmcoroutineretroft.retrofit.FakeApi
import javax.inject.Inject

class ProductRepository @Inject constructor(private val fakeApi: FakeApi,private val fakerDB: FakerDB) {

    private val _products = MutableLiveData<List<Product>>()
    val products: LiveData<List<Product>>
        get() = _products

    suspend fun getProducts(){
        val result = fakeApi.getProducts()
        fakerDB.getFakerDAO().addProducts(result.body()!!)
        if(result.isSuccessful && result.body() != null){
            _products.postValue(result.body())
        }
    }

}