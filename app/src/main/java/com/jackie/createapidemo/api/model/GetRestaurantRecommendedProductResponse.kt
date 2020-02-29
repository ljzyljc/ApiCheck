package com.jackie.createapidemo.api.model


data class GetRestaurantRecommendedProductResponse(

	val title: String?,
	val products:List<SuggestionProductView>?
)