package com.jackie.createapidemo.api.model


data class ListAddressResponseBrowserLocation(

	val address_line1: String?,
	val address_line2: String?,
	val latitude: Double?,
	val longitude: Double?,
	val city: String?,
	val state: String?,
	val county: String?,
	val zip_code: String?,
	val selected: Boolean?
)