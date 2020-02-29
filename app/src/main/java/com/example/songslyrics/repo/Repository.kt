package com.example.songslyrics.repo

import com.example.songslyrics.mvp.models.ArtistResponse
import com.example.songslyrics.service.ApiClient
import com.example.songslyrics.service.MusicApi
import retrofit2.Call

object Repository {
    fun getMusic(): Call<ArtistResponse> = ApiClient.apiClientInstance.getArtistSongs()
}