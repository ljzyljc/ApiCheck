package com.jackie.createapidemo.api.model

import com.jackie.createapidemo.api.model.enum.Nickname

data class AddressView(

	val id: String?,
	val ship_to: String?,
	val latitude: Double?,
	val longitude: Double?,
	val address_line1: String?,
	val address_line2: String?,
	val unit_number_or_company: String?,
	val phone: String?,
	val city: String?,
	val state: String?,
	val county: String?,
	val zip_code: String?,
	val nickname: Nickname?,
	val custom_nickname: String?,
	val delivery_instructions: String?,
	val default_address: Boolean?,
	val selected: Boolean?
)