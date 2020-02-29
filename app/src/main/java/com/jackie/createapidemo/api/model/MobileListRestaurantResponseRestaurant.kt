package com.jackie.createapidemo.api.model

import com.jackie.createapidemo.api.model.enum.DietCode

data class MobileListRestaurantResponseRestaurant(

	val id: String?,
	val name: String?,
	val slogan: String?,
	val cuisine_type: String?,
	val cover_image_url: String?,
	val logo_image_url: String?,
	val delivery_minutes: Double?,
	val price_rating: Double?,
	val diets:List<DietCode>?,
	val recommendation: String?,
	val recommended_by: String?
)