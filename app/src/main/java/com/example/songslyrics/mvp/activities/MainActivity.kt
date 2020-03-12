package com.example.songslyrics.mvp.activities

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import com.example.songslyrics.R
import com.example.songslyrics.mvp.models.SongsItem
import com.example.songslyrics.mvp.presenters.MusicPresenter
import com.example.songslyrics.adapters.RecyclerAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(),
    MusicView {

    private val presenter = MusicPresenter(this)
    private val adapterSong = RecyclerAdapter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        presenter.getMusicData()
        recyclerInit()
    }

    private fun recyclerInit() {
        recyclerView.adapter = adapterSong
    }

    override fun setSongsData(musicList: List<SongsItem?>) {
      //  adapterSong.setItem(musicList)
    }

    override fun onProgressEnable(value: Boolean) {
        if (value) {
            progressBar.visibility = View.VISIBLE
        } else {
            progressBar.visibility = View.GONE
        }
    }

    override fun onError() {
       val builder = AlertDialog.Builder(this)
        builder.setTitle("SOMETHING WENT WRONG")
        builder.setMessage("Error(")
        builder.setPositiveButton("OK"){dialog, which->
            dialog.dismiss()
        }
        val dialog = builder.create()
        dialog.show()
    }


}
