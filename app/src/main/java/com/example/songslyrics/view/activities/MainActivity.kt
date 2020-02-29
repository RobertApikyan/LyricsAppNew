package com.example.songslyrics.view.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.songslyrics.R
import com.example.songslyrics.datamodel.SongsItem
import com.example.songslyrics.presenter.MusicPresenter
import com.example.songslyrics.view.adapters.RecyclerAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), MusicView {

    val presentr = MusicPresenter(this)
    val adapterSong = RecyclerAdapter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        presentr.getMusicData()
        recyclerInit()
    }

    fun recyclerInit(){
        recyclerView.adapter = adapterSong
    }

    override fun setSongsData(musicList: List<SongsItem?>) {
        adapterSong.setItem(musicList)
    }


}
