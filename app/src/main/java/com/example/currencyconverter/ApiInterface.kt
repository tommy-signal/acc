package com.example.currencyconverter

import retrofit2.Call
import retrofit2.http.GET

interface ApiInterface {
    @GET("end/point")
    fun getExampleData(): Call<Void>
}