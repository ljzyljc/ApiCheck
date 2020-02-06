package com.jackie.createapidemo

import com.google.gson.annotations.SerializedName

/**
 * Description:
 * @author lrc19860926@gmail.com
 * @date 2019-04-29 15:58
 */
data class BannerModel(
    @SerializedName("image_url")
    val imgUrl: String?,
    @SerializedName("action_url")
    val actionUrl: String?,
    @SerializedName("description")
    val desc: String?,
    @SerializedName("title")
    val title: String?
)
