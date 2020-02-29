package com.jackie.createapidemo.api.model

import java.util.*

data class ListPromotionResponsePromotion(

	val id: String?,
	val promotion_code: String?,
	val promotion_name: String?,
	val brief_description: String?,
	val description: String?,
	val valid_start_date: Date?,
	val valid_end_date: Date?,
	val eligible: Boolean?,
	val ineligible_reason: String?,
	val selected: Boolean?
)