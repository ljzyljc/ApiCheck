package com.jackie.createapidemo.api.model


data class CreateSessionRequest(

	val session_token: String?,
	val version: String?,
	val device: CreateSessionRequestDevice?
)