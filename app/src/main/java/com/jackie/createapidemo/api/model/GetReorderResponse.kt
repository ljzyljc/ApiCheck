package com.jackie.createapidemo.api.model

import com.jackie.createapidemo.api.model.enum.ReorderStepView

data class GetReorderResponse(

	val restaurant: GetReorderResponseRestaurant?,
	val address: GetReorderResponseAddress?,
	val items:List<GetReorderResponseItem>?,
	val total_amount: Double?,
	val total: String?,
	val payment: GetReorderResponsePayment?,
	val step: ReorderStepView?
)