package com.example.songslyrics.repo

import com.example.songslyrics.datamodel.ArtistResponse
import com.example.songslyrics.service.ApiClient
import com.example.songslyrics.service.MusicApi
import retrofit2.Call

object Repository {
    fun getMusic(): Call<ArtistResponse> = ApiClient.get().create(MusicApi::class.java).getData()
}