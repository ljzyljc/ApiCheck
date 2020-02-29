package com.jackie.createapidemo.api.model

import com.jackie.createapidemo.api.model.enum.UserLoginTypeView

data class UserLoginRequest(

	val email: String?,
	val password: String?,
	val type: UserLoginTypeView?
)