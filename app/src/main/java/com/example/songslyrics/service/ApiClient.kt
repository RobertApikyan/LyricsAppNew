package com.example.songslyrics.service

import com.example.songslyrics.constants.AppConstants
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object ApiClient {
      val apiClientCall = get().create(MusicApi::class.java).getArtistSongs()
     //val apiClientInstance by lazy { get() }
     private   val logging = HttpLoggingInterceptor().apply {
            level = HttpLoggingInterceptor.Level.BODY
        }
       private val okHttp = OkHttpClient.Builder()
            .addInterceptor(logging)
            .build()

       private fun get(): Retrofit {
            return Retrofit.Builder()
                .addConverterFactory(GsonConverterFactory.create())
                .baseUrl(AppConstants.BASE_URL)
                .client(okHttp).build()
        }

}
