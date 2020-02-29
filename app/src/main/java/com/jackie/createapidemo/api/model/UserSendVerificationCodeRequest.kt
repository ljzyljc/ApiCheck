package com.jackie.createapidemo.api.model


data class UserSendVerificationCodeRequest(

	val email: String?,
	val phone: String?
)