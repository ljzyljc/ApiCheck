package com.jackie.createapidemo.api.model


data class UserCheckRequest(

	val email: String?,
	val full_name: String?,
	val password: String?
)