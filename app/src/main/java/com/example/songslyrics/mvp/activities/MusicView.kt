package com.example.songslyrics.mvp.activities

import com.example.songslyrics.mvp.models.SongsItem


interface MusicView {
    fun setSongsData(musicList :List<SongsItem?>)
    fun onProgressEnable(value:Boolean)
    fun onError()
}