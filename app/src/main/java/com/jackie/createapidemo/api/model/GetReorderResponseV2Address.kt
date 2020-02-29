package com.jackie.createapidemo.api.model

import com.jackie.createapidemo.api.model.enum.Nickname

data class GetReorderResponseV2Address(

	val id: String?,
	val longitude: Double?,
	val latitude: Double?,
	val address_name: String?,
	val address_short_name: String?,
	val unit_number_or_company: String?,
	val phone: String?,
	val city: String?,
	val state: String?,
	val county: String?,
	val zip_code: String?,
	val nickname: Nickname?,
	val custom_nickname: String?,
	val delivery_instructions: String?
)