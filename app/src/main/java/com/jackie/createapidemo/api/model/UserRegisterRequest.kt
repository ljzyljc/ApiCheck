package com.jackie.createapidemo.api.model

import com.jackie.createapidemo.api.model.enum.UserRegisterTypeView

data class UserRegisterRequest(

	val email: String?,
	val password: String?,
	val full_name: String?,
	val phone: String?,
	val code: String?,
	val type: UserRegisterTypeView?
)