package com.example.songslyrics.mvp.models

import com.google.gson.annotations.SerializedName

data class Stats(

	@field:SerializedName("unreviewed_annotations")
	val unreviewedAnnotations: Int? = null,

	@field:SerializedName("hot")
	val hot: Boolean? = null,

	@field:SerializedName("pageviews")
	val pageviews: Int? = null
)