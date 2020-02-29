package com.jackie.createapidemo.api.model


data class GetRestaurantChefPicksResponse(

	val title: String?,
	val products:List<SuggestionProductView>?
)