package com.example.songslyrics.view.activities

import androidx.recyclerview.widget.RecyclerView


interface MusicView {
    // todo this method is not needed
    fun setSongsAdapter(adapter: RecyclerView.Adapter<*>)
    // todo add method for setting the result
    // (example musicView.onMusicData(songs))
}