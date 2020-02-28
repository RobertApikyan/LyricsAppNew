package com.example.songslyrics.model

import com.google.gson.annotations.SerializedName

data class ArtistResponse(

	@field:SerializedName("songs")
	val hits: List<ArtistHitsItem?>? = null
)