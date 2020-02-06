package com.jackie.createapidemo.anno.model.reward

import com.google.gson.annotations.SerializedName

/**
 * Description:
 * @author lrc19860926@gmail.com
 * @date 2019-06-27 10:32
 */
data class RewardReferralRuleModel(
    @SerializedName("advocate_reward")
    val advocateReward: String?,
    @SerializedName("friend_reward")
    val friendReward: String?
)
