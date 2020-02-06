package com.jackie.createapidemo.anno.model.reward

import com.google.gson.annotations.SerializedName

/**
 * Description:
 * @author lrc19860926@gmail.com
 * @date 2019-06-27 14:20
 */
data class RewardReferralHistoryModel(
    @SerializedName("status")
    val status: String?,
    @SerializedName("created_time")
    val date: String?,
    @SerializedName("email")
    val email: String?
)
