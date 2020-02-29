package com.jackie.createapidemo.api.model


data class GetOrderResponsePriceSummary(

	val subtotal: String?,
	val tax: String?,
	val delivery_fee: String?,
	val tip: String?,
	val promotion_discount: GetOrderResponsePromotionDiscount?,
	val total: String?,
	val credit: String?,
	val actual_paid: String?
)