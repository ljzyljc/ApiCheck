package com.jackie.createapidemo.api.model

import com.jackie.createapidemo.api.model.enum.TipTypeView

data class ReorderRequestV2(

	val address_id: String?,
	val tip_type: TipTypeView?,
	val tip_amount: Double?,
	val credit_card_id: String?,
	val apple_pay_token: String?,
	val credit: Double?,
	val payable: Double?,
	val checkout_id: String?
)