package com.jackie.createapidemo

import com.google.gson.annotations.SerializedName

/**
 * Description:
 * @author lrc19860926@gmail.com
 * @date 2019-05-13 10:32
 */
data class PriceModel(
    @SerializedName("subtotal")
    val subtotal: String?,
    @SerializedName("shipping_cost")
    val freight: String?,
    @SerializedName("taxes")
    val taxes: String?,
    @SerializedName("discount")
    val discount: String?,
    @SerializedName("order_total")
    val total: String?
)
