//package com.jackie.createapidemo.api
//
//import com.changtuo.yummybazaar.data.model.account.AccountBirthdayModel
//import com.changtuo.yummybazaar.data.model.address.AddressListModel
//import com.changtuo.yummybazaar.data.model.animator.AnimationPicModel
//import com.changtuo.yummybazaar.data.model.app.ContactModel
//import com.changtuo.yummybazaar.data.model.app.UpgradeModel
//import com.changtuo.yummybazaar.data.model.brand.BrandModel
//import com.changtuo.yummybazaar.data.model.cart.CartAddListModel
//import com.changtuo.yummybazaar.data.model.cart.CartCountModel
//import com.changtuo.yummybazaar.data.model.cart.CartModel
//import com.changtuo.yummybazaar.data.model.cart.CartProductListModel
//import com.changtuo.yummybazaar.data.model.category.CategoryListModel
//import com.changtuo.yummybazaar.data.model.checkout.CartCheckListModel
//import com.changtuo.yummybazaar.data.model.checkout.CheckoutCheckModel
//import com.changtuo.yummybazaar.data.model.dynamiclink.RewardReferDynamicLinkModel
//import com.changtuo.yummybazaar.data.model.faq.FAQListModel
//import com.changtuo.yummybazaar.data.model.favorite.FavoriteCheckModel
//import com.changtuo.yummybazaar.data.model.favorite.FavoriteListModel
//import com.changtuo.yummybazaar.data.model.freebie.FreebieListModel
//import com.changtuo.yummybazaar.data.model.home.HomeModel
//import com.changtuo.yummybazaar.data.model.login.LoginModel
//import com.changtuo.yummybazaar.data.model.message.MessageModel
//import com.changtuo.yummybazaar.data.model.message.MessageUnreadCountModel
//import com.changtuo.yummybazaar.data.model.notification.NotificationSettingsModel
//import com.changtuo.yummybazaar.data.model.order.OrderListModel
//import com.changtuo.yummybazaar.data.model.order.OrderModel
//import com.changtuo.yummybazaar.data.model.order.OrderRenewModel
//import com.changtuo.yummybazaar.data.model.pricypolicy.PrivacyPolicyModel
//import com.changtuo.yummybazaar.data.model.product.ProductDetailPageModel
//import com.changtuo.yummybazaar.data.model.product.ProductListModel
//import com.changtuo.yummybazaar.data.model.product.ProductModel
//import com.changtuo.yummybazaar.data.model.response.ResponseListModel
//import com.changtuo.yummybazaar.data.model.response.ResponseModel
//import com.changtuo.yummybazaar.data.model.review.ReviewListModel
//import com.changtuo.yummybazaar.data.model.reward.*
//import com.changtuo.yummybazaar.data.model.search.SearchSuggestionListModel
//import com.changtuo.yummybazaar.data.model.session.SessionModel
//import com.jackie.createapidemo.BrandModel
//import com.jackie.createapidemo.HomeModel
//import com.jackie.createapidemo.OrderModel
//import com.jackie.createapidemo.ProductModel
//import com.jackie.createapidemo.anno.model.faq.FAQListModel
//import com.jackie.createapidemo.anno.model.reward.*
//import io.reactivex.Observable
//import okhttp3.Response
//import retrofit2.Response
//import retrofit2.http.*
//
///**
// * Description:
// * @author lrc19860926@gmail.com
// * @date 2019-04-28 15:47
// */
//interface Api {
//
//    @POST("session-v2")
//    fun getSession(@Body body: HashMap<String, Any?>): Observable<SessionModel>
//
//    @GET("home")
//    fun getHome(): Observable<HomeModel>
//
//    @GET("account/support/faqs-v2")
//    fun getFAQ(): Observable<FAQListModel>
//
//    @GET("account/support/privacy-policy-v2")
//    fun getPrivacyPolicy(): Observable<PrivacyPolicyModel>
//
//    @GET("account/support/terms-of-use-v2")
//    fun getTermsOfUse(): Observable<PrivacyPolicyModel>
//
//    @POST("customer/register")
//    fun register(@Body body: HashMap<String, Any?>): Observable<ResponseModel<LoginModel>>
//
//    @PUT("customer/login")
//    fun login(@Body body: HashMap<String, Any?>): Observable<ResponseModel<LoginModel>>
//
//    @PUT("customer/logout")
//    fun logout(): Observable<ResponseModel<SessionModel>>
//
//    @GET("account/order")
//    fun getOrderList(
//        @Query("page_index") pageIndex: Int,
//        @Query("page_size") pageSize: Int
//    ): Observable<OrderListModel>
//
//    @GET("account/order/{id}")
//    fun getOrderDetail(
//        @Path("id") id: String
//    ): Observable<OrderModel>
//
//    @GET("account/reorder-v2/{id}")
//    fun getOrderRenew(
//        @Path("id") id: String
//    ): Observable<ResponseModel<OrderRenewModel>>
//
//    @POST("account/shipping-address")
//    fun addAddress(@Body body: HashMap<String, Any?>): Observable<Response<Void>>
//
//    @PUT("account/shipping-address/{id}")
//    fun editAddress(@Path("id") id: String, @Body body: HashMap<String, Any?>): Observable<Response<Void>>
//
//    @GET("account/shipping-address")
//    fun getAddressList(
//        @Query("page_index") pageIndex: Int,
//        @Query("page_size") pageSize: Int
//    ): Observable<AddressListModel>
//
//    @DELETE("account/shipping-address/{id}")
//    fun deleteAddress(
//        @Path("id") id: String
//    ): Observable<Response<Void>>
//
//    // API: PUT /fave-product/check ,1 <= load product <= 50
//    //  有大小限制
//    @PUT("fave-product/check")
//    fun checkFavorite(@Body body: FavoriteCheckModel): Observable<FavoriteCheckModel>
//
//    @PUT("search")
//    fun getProductList(@Body body: HashMap<String, Any?>): Observable<ProductListModel>
//
//    @PUT("search")
//    fun getCategoryList(@Body body: HashMap<String, Any?>): Observable<ProductListModel>
//
//    @GET("product/{code}")
//    fun getProductDetail(@Path("code") code: String): Observable<ProductDetailPageModel>
//
//    @PUT("fave-product")
//    fun getFavoritesList(@Body body: HashMap<String, Any?>): Observable<FavoriteListModel>
//
//    @PUT("ordered-products")
//    fun getProductOrderedList(@Body body: HashMap<String, Any?>): Observable<FavoriteListModel>
//
//    @GET("notification-setting")
//    fun getNotificationSettings(): Observable<ResponseModel<NotificationSettingsModel>>
//
//    @PUT("notification-setting")
//    fun updateNotificationSettings(@Body body: HashMap<String, Any?>)
//        : Observable<ResponseModel<NotificationSettingsModel>>
//
//    @GET("message/number-of-unread")
//    fun getUnreadCount(): Observable<ResponseModel<MessageUnreadCountModel>>
//
//    @GET("message")
//    fun getMessageList(
//        @Query("page_index") pageIndex: Int,
//        @Query("page_size") pageSize: Int
//    ): Observable<ResponseModel<ResponseListModel<MessageModel>>>
//
//    @PUT("message/read")
//    fun updateReadState(@Body body: HashMap<String, Any?>): Observable<ResponseModel<Void>>
//
//    @DELETE("message/{id}")
//    fun deleteMessage(@Path("id") id: String): Observable<ResponseModel<Void>>
//
//    @GET("search-full-navs")
//    fun getCategory(): Observable<CategoryListModel>
//
//    @GET("search-suggestion")
//    fun getSearchSuggestion(
//        @Query(
//            "keyword",
//            encoded = true
//        ) keyword: String?
//    ): Observable<SearchSuggestionListModel>
//
//    @GET("search-freebie")
//    fun getFreebieList(
//        @Query("page_index") pageIndex: Int,
//        @Query("page_size") pageSize: Int
//    ): Observable<FreebieListModel>
//
//    @GET("cart/search-freebie")
//    fun getCartFreebie(
//        @Query("page_index") pageIndex: Int,
//        @Query("page_size") pageSize: Int
//    ): Observable<FreebieListModel>
//
//    @GET("cart/ordered-products")
//    fun getCartProduct(
//        @Query("page_index") pageIndex: Int,
//        @Query("page_size") pageSize: Int
//    ): Observable<CartProductListModel>
//
//    @POST("notification/stock")
//    fun notifyMe(@Body body: HashMap<String, Any?>): Observable<Response<Void>>
//
//    @PUT("fave-product/{code}/sku/{sku}")
//    fun addFavorites(
//        @Path("code") code: String?,
//        @Path("sku") sku: String?
//    ): Observable<Response<Void>>
//
//    @DELETE("fave-product/{code}/sku/{sku}")
//    fun deleteFavorites(
//        @Path("code") code: String?,
//        @Path("sku") sku: String?
//    ): Observable<Response<Void>>
//
//    @PUT("account/profile")
//    fun editProfile(@Body body: HashMap<String, Any?>): Observable<LoginModel>
//
//    @GET("account/profile")
//    fun getProfile(): Observable<LoginModel>
//
//    @POST("product/{code}/review")
//    fun addReview(
//        @Path("code") code: String?,
//        @Body body: HashMap<String, Any?>
//    ): Observable<Response<Void>>
//
//    @GET("product/{code}/reviews")
//    fun getReviewList(
//        @Path("code") code: String?,
//        @Query("page_index") pageIndex: Int,
//        @Query("page_size") pageSize: Int
//    ): Observable<ReviewListModel>
//
//    @GET("point")
//    fun getReward(): Observable<RewardModel>
//
//    @GET("point/history")
//    fun getRewardHistory(
//        @Query("page_index") pageIndex: Int,
//        @Query("page_size") pageSize: Int
//    ): Observable<RewardHistoryListModel>
//
//    @PUT("account/birthday")
//    fun saveBirthday(@Body body: HashMap<String, Any?>): Observable<AccountBirthdayModel>
//
//    @GET("referral")
//    fun getReferral(): Observable<RewardReferralModel>
//
//    @GET("referral/activity")
//    fun getReferralHistory(
//        @Query("page_index") pageIndex: Int,
//        @Query("page_size") pageSize: Int
//    ): Observable<RewardReferralHistoryListModel>
//
//    @POST("point/redeem")
//    fun redeemPoint(
//        @Body body: HashMap<String, Any?>
//    ): Observable<RewardRedeemModel>
//
//    @PUT("checkout-v2/check")
//    fun checkCart(
//        @Body body: CartCheckListModel
//    ): Observable<ResponseModel<CheckoutCheckModel>>
//
//    @GET("version")
//    fun checkVersion(
//        @Query("client_version") versionName: String
//    ): Observable<UpgradeModel>
//
//    @PUT("firebase/messaging/token")
//    fun uploadMessagingToken(
//        @Body body: HashMap<String, Any?>
//    ): Observable<Response<Void>>
//
//    @GET("contact-bar")
//    fun getContactData(): Observable<ContactModel>
//
//    @GET("referral/receiver")
//    fun getDynamicLinkReferral(): Observable<RewardReferDynamicLinkModel>
//
//    @POST("cart-v2/item/batch")
//    fun addCart(
//        @Body body: CartAddListModel
//    ): Observable<ResponseModel<ProductModel>>
//
//    @GET("cart-v2")
//    fun getCart(): Observable<ResponseModel<CartModel>>
//
//    @DELETE("cart-v2/item")
//    fun removeCart(
//        @Query("product_code") productCode: String?,
//        @Query("sku") sku: String?
//    ): Observable<ResponseModel<CartModel>>
//
//    @DELETE("cart-v2")
//    fun clearCart(): Observable<ResponseModel<CartModel>>
//
//    @PUT("cart-v2/item")
//    fun updateCart(@Body body: HashMap<String, Any?>): Observable<ResponseModel<CartModel>>
//
//    @GET("cart-v2/total")
//    fun getCartCount(): Observable<ResponseModel<CartCountModel>>
//
//    @GET("animation-setting")
//    fun getShakeAnimationPicList(): Observable<ResponseModel<AnimationPicModel>>
//
//    @GET("brand")
//    fun getBrands(): Observable<ResponseModel<ResponseListModel<BrandModel>>>
//
//}
