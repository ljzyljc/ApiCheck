package com.jackie.createapidemo

import com.google.gson.annotations.SerializedName

/**
 * Description:
 * @author lrc19860926@gmail.com
 * @date 2019-05-16 14:23
 */
data class BrandModel(
    @SerializedName("name")
    val name: String?,
    @SerializedName("image_url")
    val imageUrl: String?,
    @SerializedName("action_url")
    val actionUrl: String?,
    @SerializedName("sub_navs")
    var childList: MutableList<BrandModel>?,
    //是否需要显示下划线
    var needShowUnderLine: Boolean?,
    // 是否为标题 (用于滑动 )
    var isTitle: Boolean = false,
    // (用于滑动 )
    var tag: String?,
    // (用于滑动 )
    var title: String?,
    // 是否已经选中
    var isSelected: Boolean

)
