package com.example.songslyrics.mvp.activities

import android.os.Bundle
import android.view.View
import android.widget.SearchView
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import com.example.songslyrics.R
import com.example.songslyrics.adapters.RecyclerAdapter
import com.example.songslyrics.mvp.models.HitsItem
import com.example.songslyrics.mvp.models.Result
import com.example.songslyrics.mvp.presenters.ArtistSearchPresenter
import kotlinx.android.synthetic.main.activity_artist_search.*

class ArtistSearchActivity : AppCompatActivity(), ArtistSearchView {
    private val searchPresenter = ArtistSearchPresenter(this)
    private val adapterHits = RecyclerAdapter()
    private lateinit var  searchText:String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_artist_search)
        recyclerInit()
        searchView.setOnQueryTextListener(object:SearchView.OnQueryTextListener{
            override fun onQueryTextSubmit(p0: String): Boolean {
                searchPresenter.getSearchArtistData(p0.toString())
                return true
            }

            override fun onQueryTextChange(p0: String?): Boolean {
                searchPresenter.getSearchArtistData(p0.toString())
                return true
            }
        })
        //searchPresenter.getSearchArtistData()
    }



    private fun recyclerInit(){
        artistSearchRecycler.adapter = adapterHits
    }
    override fun setArtistSongs(searchArtist: List<HitsItem?>) {
        adapterHits.setItem(searchArtist)
    }




    override fun onProgressEnable(value: Boolean) {
        if (value) {
            progressBar.visibility = View.VISIBLE
        } else progressBar.visibility = View.GONE
    }

    override fun onError() {
        val builder = AlertDialog.Builder(this)
        builder.setTitle("SOMETHING WENT WRONG")
        builder.setMessage("Error(")
        builder.setPositiveButton("OK") { dialog, which ->
            dialog.dismiss()
        }
        val dialog = builder.create()
        dialog.show()
    }
}

