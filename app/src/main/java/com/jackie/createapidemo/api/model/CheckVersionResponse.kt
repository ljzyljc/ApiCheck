package com.jackie.createapidemo.api.model


data class CheckVersionResponse(

	val latest_release_note: String?,
	val latest_url: String?,
	val latest_version: String?,
	val updated: Boolean?,
	val must_update: Boolean?
)