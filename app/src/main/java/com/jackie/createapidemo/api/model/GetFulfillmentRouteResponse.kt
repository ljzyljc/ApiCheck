package com.jackie.createapidemo.api.model


data class GetFulfillmentRouteResponse(

	val truck_location: Location?,
	val locations:List<Location>?
)