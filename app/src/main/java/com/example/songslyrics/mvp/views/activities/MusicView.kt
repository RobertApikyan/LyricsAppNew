package com.example.songslyrics.mvp.views.activities

import com.example.songslyrics.mvp.datamodels.SongsItem


interface MusicView {
    fun setSongsData(musicList :List<SongsItem?>)
    // todo add progress callback, implement in MainActivity
    // fun onProgressEnabled(bool)
    // todo add error callback, implement in MainActivity
    // fun onError()
}