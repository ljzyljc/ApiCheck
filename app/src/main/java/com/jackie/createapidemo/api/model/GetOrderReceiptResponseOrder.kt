package com.jackie.createapidemo.api.model

import com.jackie.createapidemo.api.model.enum.OrderStatusView
import java.util.*
import com.jackie.createapidemo.api.model.enum.PaymentMethodView

data class GetOrderReceiptResponseOrder(

	val order_id: String?,
	val status: OrderStatusView?,
	val overall_rating: Double?,
	val order_date: Date?,
	val payment_method: PaymentMethodView?,
	val payment_info: String?
)