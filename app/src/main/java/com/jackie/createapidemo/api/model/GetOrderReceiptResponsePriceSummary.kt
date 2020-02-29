package com.jackie.createapidemo.api.model


data class GetOrderReceiptResponsePriceSummary(

	val subtotal_amount: Double?,
	val subtotal: String?,
	val tax: String?,
	val delivery_fee: String?,
	val tip: String?,
	val promotion_discount: GetOrderReceiptResponsePromotionDiscount?,
	val credit: String?,
	val total: String?
)