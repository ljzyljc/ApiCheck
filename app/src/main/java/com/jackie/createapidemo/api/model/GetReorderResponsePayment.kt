package com.jackie.createapidemo.api.model

import com.jackie.createapidemo.api.model.enum.PaymentMethodView

data class GetReorderResponsePayment(

	val payment_method: PaymentMethodView?,
	val credit_card_id: String?,
	val payment_info: String?
)