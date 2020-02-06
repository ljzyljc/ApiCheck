package com.jackie.createapidemo.anno.model.reward

import com.jackie.createapidemo.anno.model.faq.FAQModel
import com.google.gson.annotations.SerializedName

/**
 * Description:
 * @author lrc19860926@gmail.com
 * @date 2019-06-24 10:13
 */
data class RewardModel(
        @SerializedName("background_image_url")
    val bgUrl: String?,
        @SerializedName("redemption_reward_cards")
    val redeemPointRuleList: List<RewardRuleModel>?,
        @SerializedName("earning_reward_cards")
    val earnRuleList: List<RewardRuleModel>?,
        @SerializedName("faqs")
    val faqList: List<FAQModel>?,
        @SerializedName("point_histories")
    val historyList: List<RewardHistoryModel>?,
        @SerializedName("point_summary")
    val currentModel: RewardCurrentModel?,
        @SerializedName("total_of_point_histories")
    val historyCount: Int?

)
