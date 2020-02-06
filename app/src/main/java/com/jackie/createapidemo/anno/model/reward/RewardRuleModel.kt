package com.jackie.createapidemo.anno.model.reward

import com.google.gson.annotations.SerializedName

/**
 * Description:
 * @author lrc19860926@gmail.com
 * @date 2019-06-24 10:14
 */
data class RewardRuleModel(
    @SerializedName("rule_id")
    val id: String?,
    @SerializedName("name")
    val name: String?,
    @SerializedName("subtitle")
    val subtitle: String?,
    @SerializedName("image_url")
    val iconUrl: String?,
    @SerializedName("description")
    val desc: String?,
    @SerializedName("points")
    val points: Int?,
    @SerializedName("earned")
    val earned: Boolean?,
    @SerializedName("action_text")
    val actionText: String?,
    @SerializedName("action_type")
    val actionType: String?,
    @SerializedName("icon_url")
    val unitIconUrl: String?,

    var totalPoint: Int
) {
    companion object {

        // earn action type
        const val EARN_ACTION_TYPE_SHOP = "SHOP"
        const val EARN_ACTION_TYPE_BIRTHDAY = "BIRTHDAY"
        const val EARN_ACTION_TYPE_REFER = "REFER"

        // redeem action type
        const val REDEEM_ACTION_TYPE_SHOP = "SHOP"
        const val REDEEM_ACTION_TYPE_REDEEM = "REDEEM"
        const val REDEEM_ACTION_TYPE_DISABLE = "DISABLE"
    }
}
