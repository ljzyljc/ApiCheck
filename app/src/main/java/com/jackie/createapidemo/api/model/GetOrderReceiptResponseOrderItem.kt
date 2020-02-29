package com.jackie.createapidemo.api.model


data class GetOrderReceiptResponseOrderItem(

	val quantity: Double?,
	val product_name: String?,
	val price: String?,
	val option_value_description: String?
)