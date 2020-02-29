package com.jackie.createapidemo.api.model

import com.jackie.createapidemo.api.model.enum.DietCode

data class GetGoesWellWithProductResponse(

	val restaurant_id: String?,
	val restaurant_name: String?,
	val large_image_url: String?,
	val item_name: String?,
	val description: String?,
	val price: String?,
	val diets:List<DietCode>?
)