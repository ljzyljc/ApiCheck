package com.jackie.createapidemo.api.model


data class GetSettingsResponse(

	val notifications: GetSettingsResponseNotifications?,
	val security: GetSettingsResponseSecurity?,
	val marketing: GetSettingsResponseMarketing?
)