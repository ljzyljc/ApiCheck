package com.jackie.createapidemo.api.model

import com.jackie.createapidemo.api.model.enum.PaymentMethodView

data class GetOrderTipPaymentResponse(

	val payment_method: PaymentMethodView?,
	val order_credit_card_id: String?,
	val default_credit_card_id: String?
)