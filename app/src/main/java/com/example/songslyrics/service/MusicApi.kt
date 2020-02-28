package com.example.songslyrics.service

import com.example.songslyrics.constants.AppConstants
import com.example.songslyrics.model.ArtistResponse
import com.example.songslyrics.model.ArtistSearchResponce
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Headers

interface MusicApi {
    @Headers("x-rapidapi-key: ${AppConstants.HEADER_END}")
    @GET(AppConstants.END_POINT)
    fun getData():Call<ArtistSearchResponce>
}