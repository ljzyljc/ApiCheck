package com.jackie.createapidemo.api.model


data class GetSettingsResponseSecurity(

	val face_id_app_lock: Boolean?,
	val pin_code_app_lock: Boolean?
)