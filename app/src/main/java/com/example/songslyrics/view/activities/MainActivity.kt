package com.example.songslyrics

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import com.example.songslyrics.presenter.MusicPresenter
import com.example.songslyrics.view.activities.MusicView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), MusicView {

    val presentr = MusicPresenter(this)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        presentr.activityRegistr()

    }

    override fun setSongsAdapter(adapter: RecyclerView.Adapter<*>) {
        recyclerView.adapter = adapter
    }
}
