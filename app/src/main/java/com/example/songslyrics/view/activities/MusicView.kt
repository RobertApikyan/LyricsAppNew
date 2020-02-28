package com.example.songslyrics.view.activities

import androidx.recyclerview.widget.RecyclerView


interface MusicView {

    fun setSongsAdapter(adapter: RecyclerView.Adapter<*>)

}