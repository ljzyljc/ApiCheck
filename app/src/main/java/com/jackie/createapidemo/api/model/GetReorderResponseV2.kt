package com.jackie.createapidemo.api.model

import java.util.*

data class GetReorderResponseV2(

	val restaurant: GetReorderResponseV2Restaurant?,
	val address: GetReorderResponseV2Address?,
	val available_time_in_mins: Double?,
	val estimated_ready_to_eat_time_from: Date?,
	val estimated_ready_to_eat_time_to: Date?,
	val items:List<GetReorderResponseV2Item>?,
	val price_summary: GetReorderResponseV2PriceSummary?,
	val payment: GetReorderResponseV2Payment?,
	val checkout_id: String?
)