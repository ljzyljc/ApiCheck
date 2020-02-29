package com.jackie.createapidemo.api.model


data class CheckoutPriceSummaryView(

	val subtotal: Double?,
	val formatted_subtotal: String?,
	val tax: Double?,
	val formatted_tax: String?,
	val delivery_fee: Double?,
	val formatted_delivery_fee: String?,
	val tip: Double?,
	val formatted_tip: String?,
	val credit: Double?,
	val formatted_credit: String?,
	val promotion_discount: CheckoutPriceSummaryViewPromotionDiscount?,
	val discount: Double?,
	val formatted_discount: String?,
	val total: Double?,
	val formatted_total: String?
)