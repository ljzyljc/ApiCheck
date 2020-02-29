package com.jackie.createapidemo.api.model


data class GetOrderResponse(

	val restaurant: GetOrderResponseRestaurant?,
	val address: GetOrderResponseAddress?,
	val items:List<GetOrderResponseItem>?,
	val price_summary: GetOrderResponsePriceSummary?,
	val payment: GetOrderResponsePayment?
)