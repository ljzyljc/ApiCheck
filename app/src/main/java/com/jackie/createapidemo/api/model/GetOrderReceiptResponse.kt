package com.jackie.createapidemo.api.model

import com.jackie.createapidemo.api.model.enum.TipOperateTypeView
import com.jackie.createapidemo.api.model.enum.TipTypeView

data class GetOrderReceiptResponse(

	val order: GetOrderReceiptResponseOrder?,
	val restaurant: GetOrderReceiptResponseRestaurant?,
	val address: GetOrderReceiptResponseAddress?,
	val chefs:List<GetOrderReceiptResponseChef>?,
	val order_items:List<GetOrderReceiptResponseOrderItem>?,
	val price_summary: GetOrderReceiptResponsePriceSummary?,
	val can_reorder: Boolean?,
	val tip_operate_type: TipOperateTypeView?,
	val tip_type: TipTypeView?,
	val tip: Double?,
	val formatted_tip: String?,
	val tip_options:List<GetOrderReceiptResponseTipOption>?
)