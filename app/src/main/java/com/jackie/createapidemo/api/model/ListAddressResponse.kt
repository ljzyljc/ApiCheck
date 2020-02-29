package com.jackie.createapidemo.api.model


data class ListAddressResponse(

	val browser_location: ListAddressResponseBrowserLocation?,
	val addresses:List<AddressView>?
)