package com.jackie.createapidemo.api.model

import com.jackie.createapidemo.api.model.enum.CheckoutStepView

data class CartView(

	val restaurant_id: String?,
	val restaurant_name: String?,
	val cart_items:List<CartItemView>?,
	val goes_well_with:List<GoesWellWithProductView>?,
	val need_utensils: Boolean?,
	val promotion: PromotionView?,
	val price_summary: PriceSummaryView?,
	val step: CheckoutStepView?
)