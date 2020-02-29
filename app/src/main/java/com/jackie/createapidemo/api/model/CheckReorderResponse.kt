package com.jackie.createapidemo.api.model


data class CheckReorderResponse(

	val address_not_exist: Boolean?,
	val credit_card_not_exist: Boolean?,
	val estimated_time_increased: Boolean?
)