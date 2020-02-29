package com.jackie.createapidemo.api.model


data class ReorderRequest(

	val address_id: String?,
	val credit_card_id: String?,
	val apple_pay_token: String?,
	val total: Double?
)