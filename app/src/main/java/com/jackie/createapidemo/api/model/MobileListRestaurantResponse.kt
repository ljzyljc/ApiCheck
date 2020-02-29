package com.jackie.createapidemo.api.model


data class MobileListRestaurantResponse(

	val restaurants:List<MobileListRestaurantResponseRestaurant>?,
	val ads:List<MobileListRestaurantResponseAdvertisement>?
)