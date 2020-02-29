package com.jackie.createapidemo.api.model

import com.jackie.createapidemo.api.model.enum.DietCode

data class SuggestionProductView(

	val chef_pick_id: String?,
	val product_id: String?,
	val item_name: String?,
	val description: String?,
	val large_image_url: String?,
	val small_image_url: String?,
	val diets:List<DietCode>?,
	val price: String?,
	val base_price: String?,
	val options:List<SuggestionProductViewOption>?
)