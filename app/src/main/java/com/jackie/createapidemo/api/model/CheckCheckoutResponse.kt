package com.jackie.createapidemo.api.model

import com.jackie.createapidemo.api.model.enum.PaymentMethodView

data class CheckCheckoutResponse(

	val address_not_exist: Boolean?,
	val payment_method: PaymentMethodView?,
	val credit_card_id: String?
)