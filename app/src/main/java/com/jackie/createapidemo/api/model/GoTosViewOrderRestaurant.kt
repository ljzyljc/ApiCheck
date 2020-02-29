package com.jackie.createapidemo.api.model


data class GoTosViewOrderRestaurant(

	val restaurant: GoTosViewRestaurant?,
	val show_looking_for_more: Boolean?,
	val orders:List<GoTosViewOrder>?
)