package com.example.songslyrics.mvp.presenters

import android.util.Log
import com.example.songslyrics.mvp.datamodels.ArtistResponse
import com.example.songslyrics.repo.Repository
import com.example.songslyrics.mvp.views.activities.MusicView
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MusicPresenter(var musicView: MusicView):
    Presenter {

     fun getMusicData(){
        Repository.getMusic().enqueue(object :Callback<ArtistResponse>{
            override fun onFailure(call: Call<ArtistResponse>, t: Throwable) {
                // todo in case of error some error dialog with musicView
                // example: musicView.onError(), implement onError() method from activity side
                Log.d("Failure Data",t.message.toString())
            }

            override fun onResponse(call: Call<ArtistResponse>,
                                    response: Response<ArtistResponse>
            ) {
                if (response.isSuccessful){
                    // todo avoid response!!.songs force unwrap instead use response?.songs
                    val songs = response.body()?.response!!.songs
                    if(songs != null){
                        musicView.setSongsData(songs)
                    }

                    Log.d("RESPONSE","RES---${songs}")
                }

            }

        })
    }

}