package com.jackie.createapidemo.api.model

import com.jackie.createapidemo.api.model.enum.GetProductResponseUIType

data class GetProductResponseOption(

	val id: String?,
	val name: String?,
	val min_choices: Double?,
	val max_choices: Double?,
	val selected_choices: Double?,
	val free_until: Double?,
	val ui_type: GetProductResponseUIType?,
	val values:List<GetProductResponseOptionValue>?
)