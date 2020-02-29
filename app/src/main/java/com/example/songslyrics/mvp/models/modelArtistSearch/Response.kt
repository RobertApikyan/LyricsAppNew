package com.example.songslyrics.mvp.models.modelArtistSearch

import com.google.gson.annotations.SerializedName

data class Response(

	@field:SerializedName("hits")
	val hits: List<HitsItem?>? = null
)