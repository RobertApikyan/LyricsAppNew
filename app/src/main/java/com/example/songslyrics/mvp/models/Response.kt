package com.example.songslyrics.mvp.models

import com.google.gson.annotations.SerializedName

data class Response(

	@field:SerializedName("meta")
	val meta: Meta? = null,

	@field:SerializedName("response")
	val response: Response? = null,

	@field:SerializedName("hits")
	val hits: List<HitsItem?>? = null
)