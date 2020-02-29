
package com.jackie.createapidemo.api.model.enum

enum class FulfillmentStatusView(val value:String){
	NEW("NEW"),PENDING("PENDING"),IN_TRANSIT("IN_TRANSIT"),IN_COOKING("IN_COOKING"),FOOD_IS_READY("FOOD_IS_READY"),DELIVERED("DELIVERED"),CANCELED("CANCELED")
}