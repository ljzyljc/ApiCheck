package com.jackie.createapidemo.api.model

import com.jackie.createapidemo.api.model.enum.DietCode

data class GetProductResponseOptionValue(

	val id: String?,
	val name: String?,
	val image_url: String?,
	val formatted_price: String?,
	val price: Double?,
	val calories: Double?,
	val diets:List<DietCode>?,
	val allergens:List<String>?,
	val selected: Boolean?
)