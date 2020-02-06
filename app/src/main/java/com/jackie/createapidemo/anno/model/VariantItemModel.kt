package com.jackie.createapidemo

/**
 * Description: Variant 的单个
 * @author lrc19860926@gmail.com
 * @date 2019-05-20 15:23
 */
data class VariantItemModel(
    val icon: String?,
    val name: String?,
    val available: Boolean,
    var isSelected: Boolean
)
