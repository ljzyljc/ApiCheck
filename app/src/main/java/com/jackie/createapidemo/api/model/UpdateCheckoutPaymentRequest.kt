package com.jackie.createapidemo.api.model

import com.jackie.createapidemo.api.model.enum.PaymentMethodView

data class UpdateCheckoutPaymentRequest(

	val payment_method: PaymentMethodView?,
	val credit_card_id: String?
)