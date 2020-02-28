package com.example.songslyrics.repo

import com.example.songslyrics.model.ArtistSearchResponce
import com.example.songslyrics.service.ApiClient
import com.example.songslyrics.service.MusicApi
import retrofit2.Call

object Repository {
    fun getMusic(): Call<ArtistSearchResponce> = ApiClient.get().create(MusicApi::class.java).getData()
}