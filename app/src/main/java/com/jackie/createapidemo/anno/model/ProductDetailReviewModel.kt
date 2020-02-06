package com.jackie.createapidemo

import com.google.gson.annotations.SerializedName

/**
 * Description:
 * @author lrc19860926@gmail.com
 * @date 2019-05-20 10:21
 */
data class ProductDetailReviewModel(
    @SerializedName("rates")
    val rates: Float?,
    @SerializedName("count")
    val count: Int?,
    @SerializedName("reviews")
    val reviewList: List<ReviewModel>?
)
