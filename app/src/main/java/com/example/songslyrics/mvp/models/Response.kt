package com.example.songslyrics.mvp.models

data class Response(
	val meta: Meta? = null,
	val response: Response? = null,
	val nextPage: Int? = null,
	val songs: List<SongsItem?>? = null
)
