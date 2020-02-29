package com.jackie.createapidemo.api.model


data class UpdateSettingsRequestSecurity(

	val face_id_app_lock: Boolean?,
	val pin_code_app_lock: Boolean?
)