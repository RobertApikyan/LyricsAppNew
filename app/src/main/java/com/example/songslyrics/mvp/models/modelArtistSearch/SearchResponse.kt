package com.example.songslyrics.mvp.models.modelArtistSearch

import com.google.gson.annotations.SerializedName

data class SearchResponse(

	@field:SerializedName("meta")
	val meta: Meta? = null,

	@field:SerializedName("response")
	val response: Response? = null
)