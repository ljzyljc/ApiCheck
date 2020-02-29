package com.jackie.createapidemo.api.model

import java.util.*

data class RefreshCheckoutResponse(

	val address: AddressView?,
	val estimated_driving_minute: Double?,
	val estimated_cooking_minute: Double?,
	val estimated_ready_to_eat_time_from: Date?,
	val estimated_ready_to_eat_time_to: Date?
)