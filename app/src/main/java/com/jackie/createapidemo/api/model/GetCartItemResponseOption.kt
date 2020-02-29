package com.jackie.createapidemo.api.model

import com.jackie.createapidemo.api.model.enum.GetCartItemResponseUIType

data class GetCartItemResponseOption(

	val id: String?,
	val name: String?,
	val min_choices: Double?,
	val max_choices: Double?,
	val selected_choices: Double?,
	val free_until: Double?,
	val ui_type: GetCartItemResponseUIType?,
	val values:List<GetCartItemResponseOptionValue>?
)