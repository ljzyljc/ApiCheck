package com.jackie.createapidemo.api.model


data class UpdateCartItemRequest(

	val options:List<UpdateCartItemRequestOption>?,
	val notes: String?,
	val quantity: Double?
)