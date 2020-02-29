package com.jackie.createapidemo.api.model

import com.jackie.createapidemo.api.model.enum.DietCode

data class MobileGetRestaurantResponse(

	val id: String?,
	val name: String?,
	val cuisine_type: String?,
	val price_rating: Double?,
	val recommendation: String?,
	val recommended_by: String?,
	val logo_image_url: String?,
	val delivery_minutes: Double?,
	val diets:List<DietCode>?
)