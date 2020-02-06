package com.jackie.createapidemo.anno.model.reward

import com.google.gson.annotations.SerializedName

/**
 * Description:
 * @author lrc19860926@gmail.com
 * @date 2019-06-24 15:36
 */
data class RewardCurrentModel(
    @SerializedName("available_rewards")
    val availableCount: Int?,
    @SerializedName("total_points")
    val totalPoint: Int?,
    @SerializedName("avatar_image_url")
    val iconUrl: String?,
    @SerializedName("register_info")
    val date: String?

)
