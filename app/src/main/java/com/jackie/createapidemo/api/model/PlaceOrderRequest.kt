package com.jackie.createapidemo.api.model

import com.jackie.createapidemo.api.model.enum.TipTypeView

data class PlaceOrderRequest(

	val tip_type: TipTypeView?,
	val tip_amount: Double?,
	val apple_pay_token: String?,
	val credit: Double?,
	val payable: Double?
)