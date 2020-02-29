package com.jackie.createapidemo.api.model


data class MobileCreateCreditCardRequest(

	val card_number: String?,
	val expiration_year: String?,
	val expiration_month: String?,
	val cvc: String?,
	val billing_zip_code: String?,
	val is_default: Boolean?
)