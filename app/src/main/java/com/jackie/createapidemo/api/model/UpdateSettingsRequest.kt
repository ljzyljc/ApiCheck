package com.jackie.createapidemo.api.model


data class UpdateSettingsRequest(

	val notifications: UpdateSettingsRequestNotifications?,
	val security: UpdateSettingsRequestSecurity?,
	val marketing: UpdateSettingsRequestMarketing?
)