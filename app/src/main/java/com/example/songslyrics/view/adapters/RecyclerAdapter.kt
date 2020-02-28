package com.example.songslyrics.view.adapters

import android.net.Uri
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import coil.api.load
import com.example.songslyrics.R
import com.example.songslyrics.model.ArtistHitsItem
import com.example.songslyrics.model.ArtistResult

class RecyclerAdapter : RecyclerView.Adapter<RecyclerAdapter.ViewHolder>() {
    private  var musicList: MutableList<ArtistHitsItem?> = mutableListOf()


    fun setItem(list_of_music: List<ArtistHitsItem?>) {
        musicList.clear()
        musicList.addAll(list_of_music)
        notifyDataSetChanged()
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        val inflate =
            LayoutInflater.from(parent.context).inflate(R.layout.recycler_item, parent, false)
        return ViewHolder(inflate)
    }

    override fun getItemCount(): Int {
        return musicList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        musicList[position]?.result?.let { holder.onBind(it) }
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        private var artistImage: ImageView
        private var artistName: TextView
        private var songName: TextView
        private var backImage: ImageView
        init {
            backImage = itemView.findViewById(R.id.back_image)
            artistImage = itemView.findViewById(R.id.circleImageView)
            artistName = itemView.findViewById(R.id.name_Artist)
            songName = itemView.findViewById(R.id.name_Song)
        }

        fun onBind(requestItem: ArtistResult){
            artistImage.load(Uri.parse(requestItem.headerImageThumbnailUrl))
            backImage.load(Uri.parse(requestItem.songArtImageThumbnailUrl))
            artistName.text = requestItem.primaryArtist!!.name
            songName.text = requestItem.title


        }


    }


}