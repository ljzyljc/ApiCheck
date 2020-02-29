package com.jackie.createapidemo.api.model

import com.jackie.createapidemo.api.model.enum.DietCode

data class GetOrderItemHopUpResponse(

	val restaurant_id: String?,
	val restaurant_name: String?,
	val product_id: String?,
	val item_name: String?,
	val description: String?,
	val large_image_url: String?,
	val diets:List<DietCode>?,
	val options:List<GetOrderItemHopUpResponseOption>?,
	val price: String?,
	val available: Boolean?
)