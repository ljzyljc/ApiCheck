package com.jackie.createapidemo

import com.google.gson.annotations.SerializedName

/**
 * Description:
 * @author lrc19860926@gmail.com
 * @date 2019-05-13 10:29
 */
data class PromotionModel(
    @SerializedName("code")
    val code: String?
)
