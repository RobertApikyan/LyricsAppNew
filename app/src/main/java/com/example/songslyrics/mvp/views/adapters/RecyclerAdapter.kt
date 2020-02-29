package com.example.songslyrics.mvp.views.adapters

import android.net.Uri
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import coil.api.load
import com.example.songslyrics.R
import com.example.songslyrics.mvp.datamodels.SongsItem
import kotlinx.android.synthetic.main.recycler_item.view.*


class RecyclerAdapter : RecyclerView.Adapter<RecyclerAdapter.ViewHolder>() {
    private  var musicList: MutableList<SongsItem?> = mutableListOf()


    fun setItem(list_of_music: List<SongsItem?>) {
        musicList.clear()
        musicList.addAll(list_of_music)
        notifyDataSetChanged()
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        val inflate =
            LayoutInflater.from(parent.context).inflate(R.layout.recycler_item, parent, false)
        return ViewHolder(
            inflate
        )
    }

    override fun getItemCount(): Int {
        return musicList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
      holder.onBind(musicList[position]!!)

    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun onBind(requestItem: SongsItem){
            itemView.circleImageView.load(Uri.parse(requestItem.headerImageThumbnailUrl))
            itemView.back_image.load(Uri.parse(requestItem.songArtImageThumbnailUrl))
            itemView.name_Artist.text = requestItem.primaryArtist!!.name
            itemView.name_Song.text = requestItem.title
        }
    }
}