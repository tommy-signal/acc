package com.example.currencyconverter

import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.jaxb.JaxbConverterFactory
import retrofit2.converter.simplexml.SimpleXmlConverterFactory

object RetrofitInstance{
    private const val BASE_URL ="https://data.norges-bank.no/api/data/EXR/B.USD.NOK.SP?format=sdmx-generic-2.1&amp;lastNObservations=1&amp;locale=en"

    fun getInstance(): Retrofit {
        val client = OkHttpClient()
        val interceptor = HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BODY)
        val clientBuilder: OkHttpClient.Builder =
            client.newBuilder().addInterceptor(interceptor)

        return Retrofit.Builder().baseUrl(BASE_URL)
            .addConverterFactory(JaxbConverterFactory.create())
            .client(clientBuilder.build())
            .build()
    }
}