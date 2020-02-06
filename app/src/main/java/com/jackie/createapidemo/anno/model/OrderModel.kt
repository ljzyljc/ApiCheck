package com.jackie.createapidemo

import com.google.gson.annotations.SerializedName

/**
 * Description:
 * @author lrc19860926@gmail.com
 * @date 2019-05-09 15:44
 */
data class OrderModel(
    @SerializedName("order_id")
    val id: String?,
    @SerializedName("order_number")
    val number: String?,
    @SerializedName("ship_to")
    val destination: String?,
    @SerializedName("order_date")
    val createDate: String?,
    @SerializedName("order_status")
    val status: String?,
    @SerializedName("delivery_date")
    val deliveryDateTime:String,
    @SerializedName("estimated_delivery_date")
    val deliveryDate: String?,
    @SerializedName("total")
    val total: String?,
    @SerializedName("tracking_urls")
    val trackingUrls: List<String?>?,
    @SerializedName("shipping_info")
    val shippingModel: AddressModel?,
    @SerializedName("billing_details")
    val cardModel: CardModel?,
    @SerializedName("order_summary")
    val priceModel: PriceModel?,
    @SerializedName("shipments")
    val shipmentList: List<ShipmentModel?>?,
    @SerializedName("unshipped_items")
    val unshippedList: List<ProductModel?>?,
    @SerializedName("promotions")
    val promotionList: List<PromotionModel?>?

) {
    companion object {
        const val STATUS_PROCESSING = "PROCESSING"
        const val STATUS_REFUNDED = "REFUNDED"
        const val STATUS_PARTIAL_REFUNDED = "PARTIAL REFUNDED"
        const val STATUS_SHIPPED = "SHIPPED"
        const val STATUS_DELIVERED = "DELIVERED"
        const val STATUS_CANCELLED = "CANCELLED"
    }
}
