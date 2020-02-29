package com.jackie.createapidemo.api.model


data class GetOrderStatusResponse(

	val un_reviewed: Boolean?,
	val fulfillment: GetOrderStatusResponseFulfillment?
)