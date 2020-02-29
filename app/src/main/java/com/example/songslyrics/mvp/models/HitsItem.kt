package com.example.songslyrics.mvp.models

import com.google.gson.annotations.SerializedName

data class HitsItem(

	@field:SerializedName("result")
	val result: Result? = null,

	@field:SerializedName("highlights")
	val highlights: List<Any?>? = null,

	@field:SerializedName("index")
	val index: String? = null,

	@field:SerializedName("type")
	val type: String? = null
)