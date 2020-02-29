package com.example.songslyrics.view.activities

import com.example.songslyrics.datamodel.SongsItem


interface MusicView {
    fun setSongsData(musicList :List<SongsItem?>)
}