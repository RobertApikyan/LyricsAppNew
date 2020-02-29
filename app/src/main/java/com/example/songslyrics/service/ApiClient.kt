package com.example.songslyrics.service

import com.example.songslyrics.constants.AppConstants
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object ApiClient {
       // val apiClientInstance = get()
    // todo call create here get().create()
     val apiClientInstance by lazy { get() }
        val logging = HttpLoggingInterceptor().apply {
            level = HttpLoggingInterceptor.Level.BODY
        }
        val okHttp = OkHttpClient.Builder()
            .addInterceptor(logging)
            .build()

       private fun get(): Retrofit {
            return Retrofit.Builder()
                .addConverterFactory(GsonConverterFactory.create())
                .baseUrl(AppConstants.BASE_URL)
                .client(okHttp).build()
        }

}
