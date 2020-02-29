package com.jackie.createapidemo.api.model


data class SubscribeLocationRequest(

	val email: String?,
	val latitude: Double?,
	val longitude: Double?,
	val address_name: String?,
	val address_short_name: String?,
	val state: String?,
	val city: String?,
	val county: String?,
	val zip_code: String?
)