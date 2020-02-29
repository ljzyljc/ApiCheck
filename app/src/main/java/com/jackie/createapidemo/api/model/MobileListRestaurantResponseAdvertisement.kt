package com.jackie.createapidemo.api.model

import com.jackie.createapidemo.api.model.enum.MobileActionTypeView

data class MobileListRestaurantResponseAdvertisement(

	val image_url: String?,
	val sub_title: String?,
	val title: String?,
	val description: String?,
	val action_title: String?,
	val action_type: MobileActionTypeView?,
	val action_url: String?
)