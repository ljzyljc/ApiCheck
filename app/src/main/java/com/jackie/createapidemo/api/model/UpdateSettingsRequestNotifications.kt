package com.jackie.createapidemo.api.model


data class UpdateSettingsRequestNotifications(

	val order_status: Boolean?,
	val offers_and_promotions: Boolean?,
	val texts: Boolean?
)