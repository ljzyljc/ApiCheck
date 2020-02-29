package com.jackie.createapidemo.api.model


data class UserChangePasswordRequest(

	val old_password: String?,
	val new_password: String?
)