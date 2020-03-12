package com.example.songslyrics.mvp.presenters

import android.util.Log
import com.example.songslyrics.mvp.activities.ArtistSearchView
import com.example.songslyrics.mvp.models.ArtistResponse
import com.example.songslyrics.mvp.models.HitsItem
import com.example.songslyrics.repo.Repository
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class ArtistSearchPresenter( var artistSearchView: ArtistSearchView) {


    fun getSearchArtistData(searchArtist:String){
        artistSearchView.onProgressEnable(true)
        Repository.searchArtists(searchArtist).enqueue(object : Callback<ArtistResponse>{

            override fun onFailure(call: Call<ArtistResponse>, t: Throwable) {
                Log.d("Failure Data",t.message.toString())
                artistSearchView.onProgressEnable(false)
                artistSearchView.onError()
            }
            override fun onResponse(call: Call<ArtistResponse>, response: Response<ArtistResponse>) {
                if (response.isSuccessful){
                    val searchArtistList = response.body()?.response?.hits
                    if(searchArtistList != null){
                       Log.e("LOG--", searchArtistList.size.toString())
                       artistSearchView.setArtistSongs(searchArtistList)
                    }
                }
                artistSearchView.onProgressEnable(false)
            }

        })
    }
}