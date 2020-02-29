package com.jackie.createapidemo.api.model

import com.jackie.createapidemo.api.model.enum.ReorderStepView

data class ReorderResponse(

	val order_id: String?,
	val step: ReorderStepView?
)