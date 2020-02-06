package com.jackie.createapidemo

import com.google.gson.annotations.SerializedName

/**
 * Description:
 * @author lrc19860926@gmail.com
 * @date 2019-06-17 18:00
 */
data class ReviewModel(
    @SerializedName("title")
    val title: String?,
    @SerializedName("content")
    val content: String?,
    @SerializedName("name")
    val userName: String?,
    @SerializedName("score")
    val score: Float?
)
