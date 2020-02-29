package com.jackie.createapidemo.api.model


data class LocationRequest(

	val latitude: Double?,
	val longitude: Double?,
	val address_id: String?,
	val address_line1: String?,
	val address_line2: String?,
	val state: String?,
	val city: String?,
	val county: String?,
	val zip_code: String?
)