package com.jackie.createapidemo.api.model

import com.jackie.createapidemo.api.model.enum.TipTypeView

data class UpdateCheckoutTipRequest(

	val tip_type: TipTypeView?,
	val tip_amount: Double?
)