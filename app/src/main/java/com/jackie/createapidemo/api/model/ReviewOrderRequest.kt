package com.jackie.createapidemo.api.model

import com.jackie.createapidemo.api.model.enum.MobileComplimentTypeView
import com.jackie.createapidemo.api.model.enum.MobileFeedbackTypeView

data class ReviewOrderRequest(

	val overall_rating: Double?,
	val compliments:List<MobileComplimentTypeView>?,
	val feedback:List<MobileFeedbackTypeView>?,
	val comments: String?
)