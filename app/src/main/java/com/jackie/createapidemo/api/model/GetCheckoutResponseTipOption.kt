package com.jackie.createapidemo.api.model

import com.jackie.createapidemo.api.model.enum.TipTypeView

data class GetCheckoutResponseTipOption(

	val value: TipTypeView?,
	val name: String?
)