package com.example.songslyrics.presenter

import android.util.Log
import com.example.songslyrics.datamodel.ArtistResponse
import com.example.songslyrics.repo.Repository
import com.example.songslyrics.view.activities.MusicView
import com.example.songslyrics.view.adapters.RecyclerAdapter
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MusicPresenter(var musicView: MusicView):PresenterMusic {

    val adapterSong = RecyclerAdapter()

    fun activityRegistr(){
        musicView.setSongsAdapter(adapterSong)
        getMusicData()
    }

    override fun getMusicData(){
        Repository.getMusic().enqueue(object :Callback<ArtistResponse>{
            override fun onFailure(call: Call<ArtistResponse>, t: Throwable) {
                Log.d("Failure Data",t.message.toString())
            }

            override fun onResponse(call: Call<ArtistResponse>,
                response: Response<ArtistResponse>
            ) {
                if (response.isSuccessful){
                    val songs = response.body()!!.response!!.songs
                    if(songs != null){
                        adapterSong.setItem(songs)
                    }

                    Log.d("RESPONSE","RES---${songs}")
                }

            }

        })
    }
}