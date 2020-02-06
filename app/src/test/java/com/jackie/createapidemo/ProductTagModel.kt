package com.jackie.createapidemo

import com.google.gson.annotations.SerializedName

/**
 * Description:
 * @author lrc19860926@gmail.com
 * @date 2019-05-20 20:13
 */
data class ProductTagModel(
    @SerializedName("name")
    val name: String?,
    @SerializedName("image_url")
    val imageUrl: String?
)
