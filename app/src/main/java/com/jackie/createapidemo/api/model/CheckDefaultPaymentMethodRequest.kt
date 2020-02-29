package com.jackie.createapidemo.api.model

import com.jackie.createapidemo.api.model.enum.PaymentMethodView

data class CheckDefaultPaymentMethodRequest(

	val payment_method: PaymentMethodView?
)