package com.jackie.createapidemo.api.model


data class GetRestaurantDescriptionResponse(

	val about_restaurant: String?,
	val photo_urls:List<String>?
)