package com.jackie.createapidemo.api.model

import com.jackie.createapidemo.api.model.enum.PaymentMethodView

data class MobileListCreditCardResponsePayment(

	val id: String?,
	val payment_info: String?,
	val is_default: Boolean?,
	val payment_method: PaymentMethodView?,
	val is_expired: Boolean?
)