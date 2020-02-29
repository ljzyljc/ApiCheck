package com.jackie.createapidemo.api.model

import com.jackie.createapidemo.api.model.enum.DietCode

data class GetRestaurantMenuResponseProduct(

	val product_id: String?,
	val customizable: Boolean?,
	val item_name: String?,
	val description: String?,
	val large_image_url: String?,
	val small_image_url: String?,
	val diets:List<DietCode>?,
	val price: String?
)