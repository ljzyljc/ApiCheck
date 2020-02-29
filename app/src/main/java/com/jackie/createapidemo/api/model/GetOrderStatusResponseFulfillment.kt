package com.jackie.createapidemo.api.model

import java.util.*
import com.jackie.createapidemo.api.model.enum.FulfillmentStatusView

data class GetOrderStatusResponseFulfillment(

	val fulfillment_id: String?,
	val restaurant_name: String?,
	val estimated_delivery_time: Date?,
	val remain_cancel_time: Double?,
	val total_time_in_mins: Double?,
	val remain_time_in_mins: Double?,
	val chefs:List<GetOrderStatusResponseChef>?,
	val current_status: FulfillmentStatusView?
)