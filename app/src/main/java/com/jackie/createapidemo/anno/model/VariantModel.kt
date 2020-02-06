package com.jackie.createapidemo

import com.google.gson.annotations.SerializedName

/**
 * Description:
 * @author lrc19860926@gmail.com
 * @date 2019-05-05 14:34
 */
data class VariantModel(
    @SerializedName("sku")
    val sku: String?,
    @SerializedName("image_url")
    val imgUrl: String?,
    @SerializedName("price")
    val price: Float?,
    @SerializedName("msrp")
    val originalPrice: Float?,
    @SerializedName("size")
    val size: String?,
    @SerializedName("flavor")
    val flavor: String?,
    @SerializedName("weight")
    val weight: String?,
    @SerializedName("qty")
    val quantity: Int?,
    @SerializedName("favorite")
    var isFavorite: Boolean?,
    @SerializedName("in_stock")
    val isSelling: Boolean?,
    @SerializedName("deleted")
    val deleted: Boolean?,
    @SerializedName("buy_limit_qty")
    val buyLimitQty: Int?
)
