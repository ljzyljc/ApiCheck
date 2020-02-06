package com.jackie.createapidemo.anno.model.reward

import com.google.gson.annotations.SerializedName

/**
 * Description:
 * @author lrc19860926@gmail.com
 * @date 2019-06-27 10:27
 */
data class RewardReferralHistoryListModel(
    @SerializedName("total_completed")
    val totalCompleted: Int?,
    @SerializedName("referrals")
    val list: List<RewardReferralHistoryModel>?
)
