package com.jackie.createapidemo.api.model

import com.jackie.createapidemo.api.model.enum.TipOperateTypeView

data class UpdateOrderTipResponse(

	val tip_change_type: TipOperateTypeView?,
	val price_summary: UpdateOrderTipResponsePriceSummary?
)