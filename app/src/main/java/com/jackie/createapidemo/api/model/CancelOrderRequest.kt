package com.jackie.createapidemo.api.model

import com.jackie.createapidemo.api.model.enum.CancelOrderRequestCancelReasonType

data class CancelOrderRequest(

	val cancel_reason_type: CancelOrderRequestCancelReasonType?,
	val custom_cancel_reason: String?
)