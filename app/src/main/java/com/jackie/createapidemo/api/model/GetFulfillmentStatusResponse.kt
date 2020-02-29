package com.jackie.createapidemo.api.model

import java.util.*
import com.jackie.createapidemo.api.model.enum.FulfillmentStatusView

data class GetFulfillmentStatusResponse(

	val estimated_delivery_time: Date?,
	val remain_cancel_time: Double?,
	val total_time_in_mins: Double?,
	val remain_time_in_mins: Double?,
	val current_status: FulfillmentStatusView?
)