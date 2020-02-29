package com.jackie.createapidemo.api.model


data class GetSettingsResponseNotifications(

	val order_status: Boolean?,
	val offers_and_promotions: Boolean?,
	val texts: Boolean?
)