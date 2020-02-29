package com.jackie.createapidemo.api.model


data class GetOrderResponseItem(

	val product_name: String?,
	val option_value_description: String?,
	val quantity: Double?,
	val subtotal: String?
)