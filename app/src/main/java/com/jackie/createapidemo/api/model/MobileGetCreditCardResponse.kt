package com.jackie.createapidemo.api.model


data class MobileGetCreditCardResponse(

	val last_four_digits: String?,
	val expiration_year: String?,
	val expiration_month: String?,
	val billing_zip_code: String?,
	val is_default: Boolean?
)