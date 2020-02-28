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
    // todo move to activity
    val adapterSong = RecyclerAdapter()

    // todo config adapter in it's activity
    fun activityRegistr(){
        musicView.setSongsAdapter(adapterSong)
        // todo call getMusicData from activity
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
                // todo avoid force unwraps body().!! use instead body().?
                if (response.isSuccessful){
                    val songs = response.body()!!.response!!.songs
                    if(songs != null){
                        // todo move adapterSong in to MusicActivity
                        // for sending data activity create MusicView method
                        // (example musicView.onMusicData(songs))
                        adapterSong.setItem(songs)
                    }

                    Log.d("RESPONSE","RES---${songs}")
                }

            }

        })
    }
}