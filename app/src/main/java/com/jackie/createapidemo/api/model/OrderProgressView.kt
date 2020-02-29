package com.jackie.createapidemo.api.model


data class OrderProgressView(

	val count: Double?,
	val orders:List<OrderProgressViewOrder>?
)