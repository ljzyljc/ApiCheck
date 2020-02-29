package com.jackie.createapidemo.api.model

import java.util.*

data class CheckReorderRequest(

	val available_time_in_mins: Double?,
	val estimated_ready_to_eat_time_from: Date?,
	val estimated_ready_to_eat_time_to: Date?
)