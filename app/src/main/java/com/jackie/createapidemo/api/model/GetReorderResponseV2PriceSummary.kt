package com.jackie.createapidemo.api.model

import com.jackie.createapidemo.api.model.enum.TipTypeView

data class GetReorderResponseV2PriceSummary(

	val subtotal: Double?,
	val formatted_subtotal: String?,
	val tax: Double?,
	val formatted_tax: String?,
	val delivery_fee: Double?,
	val formatted_delivery_fee: String?,
	val tip_type: TipTypeView?,
	val tip: Double?,
	val formatted_tip: String?,
	val credit: Double?,
	val formatted_credit: String?,
	val total: Double?,
	val formatted_total: String?
)