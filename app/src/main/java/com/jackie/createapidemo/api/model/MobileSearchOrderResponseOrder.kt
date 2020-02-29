package com.jackie.createapidemo.api.model

import java.util.*
import com.jackie.createapidemo.api.model.enum.OrderStatusView

data class MobileSearchOrderResponseOrder(

	val id: String?,
	val restaurant_name: String?,
	val order_date: Date?,
	val status: OrderStatusView?,
	val items:List<MobileSearchOrderResponseOrderItem>?
)