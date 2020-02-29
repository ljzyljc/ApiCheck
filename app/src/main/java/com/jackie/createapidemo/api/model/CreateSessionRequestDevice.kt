package com.jackie.createapidemo.api.model


data class CreateSessionRequestDevice(

	val id: String?,
	val device_unique_id: String?,
	val messaging_token: String?,
	val manufacturer: String?,
	val model: String?,
	val os_version: String?
)