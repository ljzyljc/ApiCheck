package com.jackie.createapidemo.api.model

import com.jackie.createapidemo.api.model.enum.DietCode

data class GetRestaurantOrderAgainResponseProduct(

	val order_id: String?,
	val order_item_id: String?,
	val product_id: String?,
	val large_image_url: String?,
	val item_name: String?,
	val description: String?,
	val option_value_description: String?,
	val price: String?,
	val base_price: String?,
	val options:List<GetRestaurantOrderAgainResponseOption>?,
	val diets:List<DietCode>?
)