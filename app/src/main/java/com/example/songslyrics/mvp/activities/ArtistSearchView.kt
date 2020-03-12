package com.example.songslyrics.mvp.activities

import com.example.songslyrics.mvp.models.HitsItem
import com.example.songslyrics.mvp.models.Result

interface ArtistSearchView {
    fun setArtistSongs(searchArtist:List<HitsItem?>)
    fun onProgressEnable(value:Boolean)
    fun onError()
}