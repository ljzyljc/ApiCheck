package com.jackie.createapidemo

import com.google.gson.annotations.SerializedName

/**
 * Description:
 * @author lrc19860926@gmail.com
 * @date 2019-04-29 15:53
 */
data class HomeModel (
    @SerializedName("top_navs")
    val categoryList: List<CategoryModel>?,
    @SerializedName("top_banners")
    val bannerList: List<BannerModel>?,
    @SerializedName("last_order")
    val lastOrderModel: OrderModel?,
    @SerializedName("available_rewards")
    val availableRewards: Int?,
    @SerializedName("most_viewed_products")
    val mostViewedProductList: List<ProductModel>?,
    @SerializedName("reorder_products")
    val reorderProductList: List<ProductModel>?,
    @SerializedName("static_banners")
    val staticBannerList: List<BannerModel>?,
    @SerializedName("feature_brands")
    val newBrandList: List<BrandModel>?,
    @SerializedName("new_products")
    val newProductList: List<ProductModel>?,
    @SerializedName("recently_viewed_products")
    val recentlyViewedProductList: List<ProductModel>?,
    @SerializedName("favorite_products")
    val favoriteProductList: List<ProductModel>?,
    @SerializedName("reward_background_image_url")
    val rewardBackgroundImageUrl: String?,
    @SerializedName("view_all_most_viewed_products_action_url")
    val viewAllMostViewedUrl: String?,
    @SerializedName("view_all_reorder_products_action_url")
    val viewAllReorderedUrl: String?,
    @SerializedName("view_all_new_products_action_url")
    val viewAllNewProductUrl: String?,
    @SerializedName("view_all_recently_viewed_products_action_url")
    val viewAllRecentlyViewedUrl: String?

)
