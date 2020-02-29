package com.jackie.createapidemo.api.model


data class AddCartItemRequest(

	val restaurant_id: String?,
	val product_id: String?,
	val product_name: String?,
	val options:List<AddCartItemRequestOption>?,
	val notes: String?,
	val quantity: Double?
)