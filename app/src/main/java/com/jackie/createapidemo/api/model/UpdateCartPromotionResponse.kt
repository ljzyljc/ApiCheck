package com.jackie.createapidemo.api.model


data class UpdateCartPromotionResponse(

	val promotion: PromotionView?,
	val price_summary: PriceSummaryView?
)