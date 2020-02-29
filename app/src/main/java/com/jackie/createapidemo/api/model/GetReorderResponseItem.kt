package com.jackie.createapidemo.api.model


data class GetReorderResponseItem(

	val id: String?,
	val product_name: String?,
	val option_value_description: String?,
	val quantity: Double?,
	val subtotal: String?,
	val available: Boolean?
)