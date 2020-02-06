package com.jackie.createapidemo.anno.model.reward

import com.google.gson.annotations.SerializedName

/**
 * Description:
 * @author lrc19860926@gmail.com
 * @date 2019-06-26 10:15
 */
data class RewardHistoryListModel(
    @SerializedName("histories")
    val list: List<RewardHistoryModel>?
)
