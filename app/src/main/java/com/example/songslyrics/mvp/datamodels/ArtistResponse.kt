package com.example.songslyrics.mvp.datamodels

import com.google.gson.annotations.SerializedName

data class ArtistResponse(

	@field:SerializedName("meta")
	val meta: Meta? = null,

	@field:SerializedName("response")
	val response: Response? = null
)