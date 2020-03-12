package com.example.songslyrics.service

import com.example.songslyrics.constants.AppConstants
import com.example.songslyrics.mvp.models.ArtistResponse
import com.example.songslyrics.mvp.models.HitsItem
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Query

interface MusicApi {
    @Headers("x-rapidapi-key:4c4145a3camsh405049315441042p16aaf1jsna22bea2b7b70")
    @GET("artists/16775/songs")
    fun getArtistSongs():Call<ArtistResponse>
    @Headers("x-rapidapi-key:4c4145a3camsh405049315441042p16aaf1jsna22bea2b7b70")
    @GET("search")
    fun getSearchArtist(@Query("q") searchName:String):Call<ArtistResponse>
}