package com.jackie.createapidemo.api.model


data class UpdateSettingsRequestMarketing(

	val send_me_emails: Boolean?,
	val send_me_texts: Boolean?
)