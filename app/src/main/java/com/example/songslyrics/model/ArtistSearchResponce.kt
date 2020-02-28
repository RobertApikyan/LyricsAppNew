package com.example.songslyrics.model

import com.google.gson.annotations.SerializedName

data class ArtistSearchResponce(

	@field:SerializedName("meta")
	val meta: Meta? = null,

	@field:SerializedName("response")
	val response: ArtistResponse? = null
)