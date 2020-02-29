package com.jackie.createapidemo.api.model


data class PriceSummaryView(

	val formatted_subtotal: String?,
	val formatted_tax: String?,
	val formatted_delivery_fee: String?,
	val promotion_discount: PriceSummaryViewPromotionDiscount?,
	val formatted_credit: String?,
	val formatted_total: String?,
	val formatted_minimum_difference: String?
)