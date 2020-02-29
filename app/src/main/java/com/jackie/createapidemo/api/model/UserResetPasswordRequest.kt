package com.jackie.createapidemo.api.model


data class UserResetPasswordRequest(

	val verification_code: String?,
	val new_password: String?
)