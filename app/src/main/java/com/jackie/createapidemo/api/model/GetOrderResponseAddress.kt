package com.jackie.createapidemo.api.model

import com.jackie.createapidemo.api.model.enum.Nickname

data class GetOrderResponseAddress(

	val address_line: String?,
	val longitude: Double?,
	val latitude: Double?,
	val unit_number_or_company: String?,
	val phone: String?,
	val nickname: Nickname?,
	val custom_nickname: String?,
	val delivery_instructions: String?
)