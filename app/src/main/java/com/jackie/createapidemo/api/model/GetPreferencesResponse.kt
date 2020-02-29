package com.jackie.createapidemo.api.model

import com.jackie.createapidemo.api.model.enum.DeliveryTimeRangeView
import com.jackie.createapidemo.api.model.enum.DietCode

data class GetPreferencesResponse(

	val delivery_preference: DeliveryTimeRangeView?,
	val diet_preferences:List<DietCode>?,
	val allergies_note: String?
)