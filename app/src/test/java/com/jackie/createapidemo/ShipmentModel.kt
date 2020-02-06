package com.jackie.createapidemo

import com.google.gson.annotations.SerializedName

/**
 * Description:
 * @author lrc19860926@gmail.com
 * @date 2019-05-13 14:18
 */
data class ShipmentModel(
    @SerializedName("shipment_id")
    val id: String?,
    @SerializedName("shipment_items")
    val productList: List<ProductModel?>?,
    @SerializedName("tracking_url")
    val trackingUrl: String?,
    @SerializedName("tracking_number")
    val trackingNumber: String?
)
