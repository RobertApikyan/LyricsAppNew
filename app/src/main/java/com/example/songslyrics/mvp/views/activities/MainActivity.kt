package com.example.songslyrics.mvp.views.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.songslyrics.R
import com.example.songslyrics.mvp.datamodels.SongsItem
import com.example.songslyrics.mvp.presenters.MusicPresenter
import com.example.songslyrics.mvp.views.adapters.RecyclerAdapter
import kotlinx.android.synthetic.main.activity_main.*
// todo package refactor is not correct make packages as shown below
// constants
// dataModel (could be renamed to model)
// adapters
// repos
// services
// mvp^
//      activities
//      fragments
//      presenters
//      views
class MainActivity : AppCompatActivity(), MusicView {
    // todo make attention on access modifier warnings
    // here could be private presenter
    val presentr = MusicPresenter(this)
    val adapterSong = RecyclerAdapter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        presentr.getMusicData()
        recyclerInit()
    }

    // todo make attention on access modifier warnings
    fun recyclerInit(){
        recyclerView.adapter = adapterSong
    }

    override fun setSongsData(musicList: List<SongsItem?>) {
        adapterSong.setItem(musicList)
    }
}
