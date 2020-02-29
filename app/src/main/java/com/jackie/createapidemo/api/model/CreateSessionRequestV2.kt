package com.jackie.createapidemo.api.model


data class CreateSessionRequestV2(

	val session_token: String?,
	val version: String?,
	val device: CreateSessionRequestV2Device?
)