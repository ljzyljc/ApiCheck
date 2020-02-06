package com.jackie.createapidemo.anno.model.reward

import com.google.gson.annotations.SerializedName

/**
 * Description:
 * @author lrc19860926@gmail.com
 * @date 2019-06-25 10:12
 */
data class RewardHistoryModel(
    @SerializedName("created_time")
    val createDate: String?,
    @SerializedName("rule_name")
    val name: String?,
    @SerializedName("description")
    val desc: String?,
    @SerializedName("change_points_description")
    val log: String?,
    @SerializedName("left_points")
    val currentPoint: Int?,
    @SerializedName("change_points")
    val changePoints: Int?,
    @SerializedName("type")
    val type: String?,
    @SerializedName("redeem_coupon_code")
    val couponCode: String?,

    // 是否为可视状态
    var isShowStatus: Boolean

) {

    companion object {

        //        const val TYPE_SIGN_UP = "SIGN_UP"
        const val TYPE_REFERRAL_SIGN_UP = "REFERRAL_SIGN_UP"
        const val TYPE_REDEEM = "REDEEM"

        //        const val TYPE_INIT = "INIT"

//        const val TYPE_ORDER_PAID = "ORDER_PAID"
//        const val TYPE_ORDER_CANCEL = "ORDER_CANCEL"
//        const val TYPE_ORDER_REFUND = "ORDER_REFUND"

//        const val TYPE_ADJUST = "ADJUST"
//        const val TYPE_PLACE_FIRST_NTH_ORDER = "PLACE_FIRST_NTH_ORDER"
//        const val TYPE_MEAL_PLANNING = "MEAL_PLANNING"
//        const val TYPE_REFERRAL = "REFERRAL"
    }
}
