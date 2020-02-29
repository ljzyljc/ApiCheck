package com.jackie.createapidemo.api.model

import com.jackie.createapidemo.api.model.enum.GenderView

data class GetOrderStatusResponseChef(

	val avatar_image_url: String?,
	val name: String?,
	val gender: GenderView?
)