package com.jackie.createapidemo

import com.google.gson.annotations.SerializedName

/**
 * Description:
 * @author lrc19860926@gmail.com
 * @date 2019-05-05 14:30
 */
data class ProductModel(
    @SerializedName("image_url")
    val iconUrl: String?,
    @SerializedName("image_urls")
    val imgUrlList: List<String>?,
    @SerializedName("code")
    val code: String?,
    @SerializedName("product_code")
    val productCode: String?,
    @SerializedName("brand")
    val brand: String?,
    @SerializedName("brand_action_url")
    val brandActionUrl: String?,
    @SerializedName("name")
    val name: String?,
    // 和上面的name属于相同
    @SerializedName("product_name")
    val productName: String?,
    @SerializedName("region")
    val region: String?,
    @SerializedName("review_ratings")
    val rating: Float?,
    @SerializedName("review")
    val review: ProductDetailReviewModel?,
    @SerializedName("flavors_count")
    val flavorsCount: Int?,
    @SerializedName("sizes_count")
    val sizesCount: Int?,
    @SerializedName("in_stock")
    val inStock: Boolean?,
    @SerializedName("new_product")
    val isNew: Boolean?,
    @SerializedName("quantity")
    var quantity: Int?,
    @SerializedName("variant")
    val variant: VariantModel?,
    @SerializedName("variants")
    val variantList: List<VariantModel>?,
    // 既有 string 又有 float,
    // order detail "$6.75"
    @SerializedName("price")
    val price: String?,
    // 单价
    @SerializedName("unit_price")
    val unitPrice: String?,
    @SerializedName("size")
    val size: String?,
    @SerializedName("flavor")
    val flavor: String?,
    @SerializedName("item_size")
    val itemSize: String?,
    @SerializedName("item_flavor")
    val itemFlavor: String?,
    @SerializedName("available")
    val available: Boolean?,
    @SerializedName("country_of_origin")
    val countryName: String?,
    @SerializedName("country_image_url")
    val countryFlag: String?,
    @SerializedName("diets")
    val tagList: List<ProductTagModel>?,
    @SerializedName("description")
    val desc: String?,
    @SerializedName("ingredient")
    val ingredient: String?,
    @SerializedName("shipping_info")
    val shippingInfo: String?,
    @SerializedName("sku")
    val sku: String?,
    @SerializedName("action_url")
    val actionUrl: String?,
    @SerializedName("shopify_graphql_api_id")
    val shopifyId: String?,
    @SerializedName("enable_review")
    val enableReview: Boolean?,
    @SerializedName("status")
    val status: String?,

    // 是否收藏
    var isFavorite: Boolean,
    // 是否选中
    var isSelected: Boolean,
    // 是否可点击
    var isSelectable: Boolean
) {

    fun hasMoreSku(): Boolean {
        return flavorsCount ?: 0 > 1 || sizesCount ?: 0 > 1
    }

    fun isAvailable(): Boolean {
        return available == false || variant?.deleted == true
    }

    /**
     * 获取favor列表
     */
    fun getFlavorList(): List<VariantItemModel>? {
        if (!variantList.isNullOrEmpty()) {
            val list = variantList.sortedByDescending { it.isSelling }
            val data = LinkedHashMap<String, VariantItemModel>(list.size)
            for (model in list) {

                if (!model.flavor.isNullOrBlank() && !data.contains(model.flavor)) {
                    data[model.flavor] = VariantItemModel(
                        model.imgUrl,
                        model.flavor,
                        model.isSelling == true,
                        false
                    )
                }
            }
            return ArrayList(data.values)
        }
        return null
    }

    /**
     * 获取size列表
     */
    fun getSizeList(flavor: String?): List<VariantItemModel>? {

        if (variantList.isNullOrEmpty()) {
            return null
        }

        val list = variantList.sortedByDescending { it.isSelling }

        val data = LinkedHashMap<String, VariantItemModel>(list.size)

        list.forEachIndexed { _, variantModel ->

            if (!variantModel.size.isNullOrBlank() &&
                !data.contains(variantModel.size) &&
                variantModel.flavor == flavor
            ) {

                data[variantModel.size] = VariantItemModel(
                    null,
                    variantModel.size,
                    available = true, // size不现实斜线
                    isSelected = false
                )
            }
        }

        return ArrayList(data.values)
    }

//    fun getSizeAndFlavor(): String {
//        val sb = StringBuilder()
//        if (!itemSize.isNullOrEmpty()) {
//            sb.append(
//                ResourceUtil.getString(
//                    App.instance,
//                    R.string.common_title_size_placeholder,
//                    itemSize
//                )
//            )
//            sb.append(" ")
//        }
//
//        if (!itemFlavor.isNullOrEmpty()) {
//            sb.append(
//                ResourceUtil.getString(
//                    App.instance,
//                    R.string.common_title_flavor_placeholder,
//                    itemFlavor
//                )
//            )
//        }
//        if (!size.isNullOrEmpty()) {
//            sb.append(
//                ResourceUtil.getString(
//                    App.instance,
//                    R.string.common_title_size_placeholder,
//                    size
//                )
//            )
//            sb.append(" ")
//        }
//        if (!flavor.isNullOrEmpty()) {
//            sb.append(
//                ResourceUtil.getString(
//                    App.instance,
//                    R.string.common_title_flavor_placeholder,
//                    flavor
//                )
//            )
//        }
//
//        return sb.toString()
//    }

    /**
     * 判断状态
     */
    companion object {
        const val STATUS_ACTIVE = "ACTIVE"
        const val STATUS_OUT_OF_STOCK = "OUT_OF_STOCK"
        const val STATUS_INACTIVE = "INACTIVE"
    }
}
