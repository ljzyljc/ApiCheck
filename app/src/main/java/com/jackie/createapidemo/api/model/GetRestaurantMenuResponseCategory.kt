package com.jackie.createapidemo.api.model


data class GetRestaurantMenuResponseCategory(

	val name: String?,
	val products:List<GetRestaurantMenuResponseProduct>?
)