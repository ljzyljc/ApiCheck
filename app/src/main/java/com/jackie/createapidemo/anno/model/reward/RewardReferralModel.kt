package com.jackie.createapidemo.anno.model.reward

import com.google.gson.annotations.SerializedName

/**
 * Description:
 * @author lrc19860926@gmail.com
 * @date 2019-06-27 10:27
 */
data class RewardReferralModel(
    @SerializedName("sharing_url")
    val sharingUrl: String?,
    @SerializedName("email_subject")
    val emailSubject: String?,
    @SerializedName("email_body")
    val emailBody: String?,
    @SerializedName("referral_rule")
    val ruleModel: RewardReferralRuleModel?
)
