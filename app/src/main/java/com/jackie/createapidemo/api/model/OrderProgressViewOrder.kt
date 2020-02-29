package com.jackie.createapidemo.api.model

import com.jackie.createapidemo.api.model.enum.OrderStatusView
import java.util.*

data class OrderProgressViewOrder(

	val id: String?,
	val order_status: OrderStatusView?,
	val order_status_title: String?,
	val restaurant_name: String?,
	val estimated_delivery_time: Date?,
	val actual_delivery_time: Date?
)