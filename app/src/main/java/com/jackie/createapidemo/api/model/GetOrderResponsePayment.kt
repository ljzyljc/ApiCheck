package com.jackie.createapidemo.api.model

import com.jackie.createapidemo.api.model.enum.PaymentMethodView

data class GetOrderResponsePayment(

	val payment_method: PaymentMethodView?,
	val payment_info: String?
)