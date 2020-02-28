package com.example.songslyrics.model

import com.google.gson.annotations.SerializedName

data class ArtistHitsItem(

	@field:SerializedName("result")
	val result: ArtistResult? = null,

	@field:SerializedName("highlights")
	val highlights: List<Any?>? = null,

	@field:SerializedName("index")
	val index: String? = null,

	@field:SerializedName("type")
	val type: String? = null
)