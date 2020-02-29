package com.example.songslyrics.mvp.views.activities

import com.example.songslyrics.mvp.datamodels.SongsItem


interface MusicView {
    fun setSongsData(musicList :List<SongsItem?>)
}