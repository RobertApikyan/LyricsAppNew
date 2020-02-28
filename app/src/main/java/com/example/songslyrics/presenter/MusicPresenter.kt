package com.example.songslyrics.presenter

import android.util.Log
import com.example.songslyrics.model.ArtistSearchResponce
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
        Repository.getMusic().enqueue(object :Callback<ArtistSearchResponce>{
            override fun onFailure(call: Call<ArtistSearchResponce>, t: Throwable) {
                Log.d("Failure Data",t.message.toString())
            }

            override fun onResponse(call: Call<ArtistSearchResponce>,
                response: Response<ArtistSearchResponce>
            ) {
                if (response.isSuccessful){
                    val hits = response.body()!!.response!!.hits
                    if(hits != null){
                        adapterSong.setItem(hits)
                    }

                    Log.d("RESPONSE","RES---${hits}")
                }

            }

        })
    }
}