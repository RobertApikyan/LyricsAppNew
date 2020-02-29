package com.example.songslyrics.service

import com.example.songslyrics.constants.AppConstants
import com.example.songslyrics.datamodel.ArtistResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Headers

interface MusicApi {
    @Headers("x-rapidapi-key: ${AppConstants.HEADER_END}")
    @GET("artists/16775/songs")
    fun getData():Call<ArtistResponse>
}