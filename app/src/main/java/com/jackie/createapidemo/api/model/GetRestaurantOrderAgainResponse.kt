package com.jackie.createapidemo.api.model


data class GetRestaurantOrderAgainResponse(

	val conflict_cart_restaurant_id: String?,
	val products:List<GetRestaurantOrderAgainResponseProduct>?
)