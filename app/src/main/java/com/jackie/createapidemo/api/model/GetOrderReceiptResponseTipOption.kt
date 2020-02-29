package com.jackie.createapidemo.api.model

import com.jackie.createapidemo.api.model.enum.TipTypeView

data class GetOrderReceiptResponseTipOption(

	val value: TipTypeView?,
	val name: String?,
	val tip: Double?,
	val formatted_tip: String?
)