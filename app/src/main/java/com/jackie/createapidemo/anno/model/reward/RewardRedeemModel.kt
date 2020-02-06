package com.jackie.createapidemo.anno.model.reward

import com.google.gson.annotations.SerializedName

/**
 * Description:
 * @author lrc19860926@gmail.com
 * @date 2019-06-28 16:23
 */
data class RewardRedeemModel(
    @SerializedName("coupon_code")
    val couponCode: String?
)
