package com.jackie.createapidemo.api.model

import com.jackie.createapidemo.api.model.enum.CartItemStatusView

data class CartItemView(

	val id: String?,
	val product_id: String?,
	val item_name: String?,
	val option_value_description: String?,
	val quantity: Double?,
	val subtotal: String?,
	val status: CartItemStatusView?
)