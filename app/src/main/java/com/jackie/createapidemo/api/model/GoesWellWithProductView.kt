package com.jackie.createapidemo.api.model


data class GoesWellWithProductView(

	val product_id: String?,
	val large_image_url: String?,
	val item_name: String?,
	val description: String?,
	val price: String?,
	val has_option: Boolean?
)