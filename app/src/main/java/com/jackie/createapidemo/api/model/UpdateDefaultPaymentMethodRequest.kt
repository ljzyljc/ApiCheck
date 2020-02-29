package com.jackie.createapidemo.api.model

import com.jackie.createapidemo.api.model.enum.PaymentMethodView

data class UpdateDefaultPaymentMethodRequest(

	val default_payment_method: PaymentMethodView?
)