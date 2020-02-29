package com.jackie.createapidemo.api.model


data class SearchOtherOrderResponse(

	val total_page: Double?,
	val page_index: Double?,
	val orders:List<OrderView>?
)