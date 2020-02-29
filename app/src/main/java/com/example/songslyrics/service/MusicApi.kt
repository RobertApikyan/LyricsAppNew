package com.example.songslyrics.service

import com.example.songslyrics.constants.AppConstants
import com.example.songslyrics.mvp.models.ArtistResponse
import com.example.songslyrics.mvp.models.modelArtistSearch.SearchResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Query

interface MusicApi {
    @Headers("x-rapidapi-key: ${AppConstants.HEADER_END}")
    @GET("artists/16775/songs")
    fun getArtistSongs():Call<ArtistResponse>
    @GET("search")
    fun getSearchArtist(@Query("q") searchName:String):Call<SearchResponse>
}