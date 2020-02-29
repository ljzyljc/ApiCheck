package com.jackie.createapidemo.api.model

import com.jackie.createapidemo.api.model.enum.DietCode

data class GetCartItemResponse(

	val id: String?,
	val restaurant_id: String?,
	val item_name: String?,
	val description: String?,
	val large_image_url: String?,
	val small_image_url: String?,
	val diets:List<DietCode>?,
	val formatted_base_price: String?,
	val base_price: Double?,
	val formatted_price: String?,
	val price: Double?,
	val quantity: Double?,
	val options:List<GetCartItemResponseOption>?,
	val nutrition: GetCartItemResponseNutrition?,
	val notes: String?
)