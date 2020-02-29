package com.jackie.createapidemo.api.model

import com.jackie.createapidemo.api.model.enum.StepView
import com.jackie.createapidemo.api.model.enum.CheckoutStepView

data class AddAddressResponse(

	val address_id: String?,
	val step: StepView?,
	val checkout_step: CheckoutStepView?
)