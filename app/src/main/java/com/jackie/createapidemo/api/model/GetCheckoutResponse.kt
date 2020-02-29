package com.jackie.createapidemo.api.model

import com.jackie.createapidemo.api.model.enum.PaymentMethodView
import com.jackie.createapidemo.api.model.enum.TipTypeView
import java.util.*

data class GetCheckoutResponse(

	val address: AddressView?,
	val payment_method: PaymentMethodView?,
	val credit_card: GetCheckoutResponseCreditCard?,
	val tip_type: TipTypeView?,
	val tip: String?,
	val tip_options:List<GetCheckoutResponseTipOption>?,
	val estimated_driving_minute: Double?,
	val estimated_cooking_minute: Double?,
	val estimated_ready_to_eat_time_from: Date?,
	val estimated_ready_to_eat_time_to: Date?,
	val checkout_items:List<CheckoutItem>?,
	val price_summary: CheckoutPriceSummaryView?
)