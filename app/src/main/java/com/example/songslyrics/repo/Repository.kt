package com.example.songslyrics.repo

import com.example.songslyrics.mvp.datamodels.ArtistResponse
import com.example.songslyrics.service.ApiClient
import com.example.songslyrics.service.MusicApi
import retrofit2.Call

object Repository {

    // todo do not create service instance for every call, for now move create(MusicApi::class.java) in to ApiClient
    fun getMusic(): Call<ArtistResponse> = ApiClient.apiClientInstance.create(MusicApi::class.java).getData()
}