package com.example.songslyrics.mvp.models

data class SongsItem(
	val lyricsOwnerId: Int? = null,
	val annotationCount: Int? = null,
	val songArtImageUrl: String? = null,
	val primaryArtist: PrimaryArtist? = null,
	val title: String? = null,
	val apiPath: String? = null,
	val url: String? = null,
	val path: String? = null,
	val songArtImageThumbnailUrl: String? = null,
	val fullTitle: String? = null,
	val stats: Stats? = null,
	val titleWithFeatured: String? = null,
	val id: Int? = null,
	val headerImageThumbnailUrl: String? = null,
	val pyongsCount: Any? = null,
	val headerImageUrl: String? = null,
	val lyricsState: String? = null
)
