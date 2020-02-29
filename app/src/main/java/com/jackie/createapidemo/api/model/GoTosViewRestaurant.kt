package com.jackie.createapidemo.api.model

import com.jackie.createapidemo.api.model.enum.DietCode

data class GoTosViewRestaurant(

	val id: String?,
	val delivery_minutes: Double?,
	val name: String?,
	val cuisine_type: String?,
	val price_rating: Double?,
	val logo_image_url: String?,
	val diets:List<DietCode>?,
	val recommendation: String?,
	val recommended_by: String?
)