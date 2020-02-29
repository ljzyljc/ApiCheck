package com.jackie.createapidemo.api.model

import com.jackie.createapidemo.api.model.enum.TipTypeView

data class UpdateCheckoutTipResponse(

	val tip_Type: TipTypeView?,
	val tip: String?,
	val price_summary: CheckoutPriceSummaryView?
)