package com.jackie.createapidemo.api.model


data class MobileSearchOrderResponse(

	val active_orders:List<MobileSearchOrderResponseOrder>?,
	val other_orders:List<MobileSearchOrderResponseOrder>?,
	val total_page: Double?,
	val page_index: Double?
)