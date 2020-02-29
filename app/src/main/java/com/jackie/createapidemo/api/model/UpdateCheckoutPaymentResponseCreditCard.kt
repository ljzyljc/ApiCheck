package com.jackie.createapidemo.api.model


data class UpdateCheckoutPaymentResponseCreditCard(

	val id: String?,
	val credit_card_info: String?,
	val is_expired: Boolean?
)