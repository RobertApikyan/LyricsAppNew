package com.example.songslyrics.mvp.datamodels

import com.google.gson.annotations.SerializedName

data class Response(

	@field:SerializedName("next_page")
	val nextPage: Any? = null,

	@field:SerializedName("songs")
	val songs: List<SongsItem?>? = null
)