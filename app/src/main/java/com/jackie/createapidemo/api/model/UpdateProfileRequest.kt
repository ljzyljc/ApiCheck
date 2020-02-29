package com.jackie.createapidemo.api.model


data class UpdateProfileRequest(

	val full_name: String?,
	val birthday_month: String?,
	val birthday_day: String?,
	val phone: String?
)