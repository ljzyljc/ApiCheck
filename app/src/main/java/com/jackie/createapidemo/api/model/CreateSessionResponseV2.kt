package com.jackie.createapidemo.api.model


data class CreateSessionResponseV2(

	val device_id: String?,
	val session_token: String?,
	val longitude: Double?,
	val latitude: Double?,
	val address_line1: String?,
	val address_line2: String?,
	val city: String?,
	val state: String?,
	val county: String?,
	val zip_code: String?
)