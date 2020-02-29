package com.jackie.createapidemo.api.model

import com.jackie.createapidemo.api.model.enum.TipTypeView
import com.jackie.createapidemo.api.model.enum.PaymentMethodView

data class UpdateOrderTipRequest(

	val tip_type: TipTypeView?,
	val tip_amount: Double?,
	val payment_method: PaymentMethodView?,
	val credit_card_id: String?,
	val apple_pay_token: String?
)