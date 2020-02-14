
package com.jackie.createapidemo.api.json;

import retrofit2.http.*

interface ApiRequest {

	@POST("device/{id}/channel/{number}")
	fun deviceWebServiceRegister(@Path("id") id: String?, @Path("number") number: String?, @Body body: RegisterDeviceRequest): Observable<Response<RegisterDeviceResponse>>

	@PUT("device/{id}/messaging-token")
	fun deviceWebServiceUpdate(@Path("id") id: String?,@Body body: UpdateMessagingTokenRequest): Observable<Response<Void>> 

	@POST("session")
	fun sessionWebServiceCreate(@Body body: CreateSessionRequest): Observable<Response<CreateSessionResponse>> 

	@POST("v2/session")
	fun sessionWebServiceCreateV2(@Body body: CreateSessionRequestV2): Observable<Response<CreateSessionResponseV2>> 

	@GET("version")
	fun versionWebServiceCheck(@Body body: CheckVersionRequest): Observable<Response<CheckVersionResponse>> 

	@PUT("user/change-password")
	fun wonderUserWebServiceChangePassword(@Body body: UserChangePasswordRequest): Observable<Response<Void>> 

	@PUT("user/check")
	fun wonderUserWebServiceCheck(@Body body: UserCheckRequest): Observable<Response<Void>> 

	@PUT("user/login")
	fun wonderUserWebServiceLogin(@Body body: UserLoginRequest): Observable<Response<UserLoginResponse>> 

	@PUT("user/logout")
	fun wonderUserWebServiceLogout(): Observable<Response<UserLogoutResponse>> 

	@POST("user/phone-captcha")
	fun wonderUserWebServiceSendCaptchaV2(@Body body: UserSendCaptchaRequest): Observable<Response<Void>> 

	@POST("user/register")
	fun wonderUserWebServiceRegister(@Body body: UserRegisterRequest): Observable<Response<UserRegisterResponse>> 

	@PUT("user/reset-password")
	fun wonderUserWebServiceResetPassword(@Body body: UserResetPasswordRequest): Observable<Response<UserResetPasswordResponse>> 

	@POST("user/verification-code")
	fun wonderUserWebServiceSendVerificationCode(@Body body: UserSendVerificationCodeRequest): Observable<Response<Void>> 

	@POST("v2/user/register")
	fun wonderUserWebServiceRegisterV2(@Body body: UserRegisterRequest): Observable<Response<UserRegisterResponse>> 

	@GET("account/preferences")
	fun accountWebServiceGetPreferences(): Observable<Response<GetPreferencesResponse>> 

	@PUT("account/preferences")
	fun accountWebServiceUpdatePreferences(@Body body: UpdatePreferencesRequest): Observable<Response<Void>> 

	@GET("account/profile")
	fun accountWebServiceGetProfile(): Observable<Response<ProfileView>> 

	@PUT("account/profile")
	fun accountWebServiceUpdateProfile(@Body body: UpdateProfileRequest): Observable<Response<Void>> 

	@GET("account/settings")
	fun accountWebServiceSettings(): Observable<Response<GetSettingsResponse>> 

	@PUT("account/settings")
	fun accountWebServiceUpdateSettings(@Body body: UpdateSettingsRequest): Observable<Response<Void>> 

	@GET("app-start-ad")
	fun wonderAdWebServiceGet(): Observable<Response<GetAppStartAdResponse>> 

	@GET("restaurant")
	fun wonderRestaurantWebServiceList(): Observable<Response<MobileListRestaurantResponse>> 

	@GET("restaurant/{id}")
	fun wonderRestaurantWebServiceGet(@Path("id") id: String?): Observable<Response<MobileGetRestaurantResponse>> 

	@GET("restaurant/{id}/chef-picks")
	fun wonderRestaurantWebServiceGetChefPicks(@Path("id") id: String?): Observable<Response<GetRestaurantChefPicksResponse>> 

	@GET("restaurant/{id}/description")
	fun wonderRestaurantWebServiceGetDescription(@Path("id") id: String?): Observable<Response<GetRestaurantDescriptionResponse>> 

	@GET("restaurant/{id}/menu")
	fun wonderRestaurantWebServiceGetMenu(@Path("id") id: String?): Observable<Response<GetRestaurantMenuResponse>> 

	@GET("restaurant/{id}/order-again")
	fun wonderRestaurantWebServiceGetOrderAgain(@Path("id") id: String?): Observable<Response<GetRestaurantOrderAgainResponse>> 

	@GET("restaurant/{id}/recommended-product")
	fun wonderRestaurantWebServiceGetRecommendedProduct(@Path("id") id: String?): Observable<Response<GetRestaurantRecommendedProductResponse>> 

	@GET("restaurant/go-tos")
	fun wonderRestaurantWebServiceGetGoTos(): Observable<Response<GoTosView>> 

	@GET("address")
	fun addressWebServiceList(): Observable<Response<ListAddressResponse>> 

	@POST("address")
	fun addressWebServiceCreate(@Body body: CreateAddressRequest): Observable<Response<CreateAddressResponse>> 

	@GET("address/{id}")
	fun addressWebServiceGet(@Path("id") id: String?): Observable<Response<AddressView>> 

	@PUT("address/{id}")
	fun addressWebServiceUpdate(@Path("id") id: String?,@Body body: UpdateAddressRequest): Observable<Response<Void>> 

	@DELETE("address/{id}")
	fun addressWebServiceDelete(@Path("id") id: String?): Observable<Response<Void>> 

	@PUT("location")
	fun locationWebServiceUpdate(@Body body: LocationRequest): Observable<Response<Void>> 

	@POST("location/subscribe")
	fun locationWebServiceSubscribe(@Body body: SubscribeLocationRequest): Observable<Response<Void>> 

	@PUT("product/{id}")
	fun wonderProductWebServiceGet(@Path("id") id: String?): Observable<Response<GetProductResponse>> 

	@GET("chef-pick/{id}")
	fun wonderChefPickWebServiceGet(@Path("id") id: String?): Observable<Response<GetProductResponse>> 

	@GET("goes-well-with/{productId}")
	fun goesWellWithWebServiceGet(@Path("productId") productId: String?): Observable<Response<GetGoesWellWithProductResponse>> 

	@GET("credit-card")
	fun creditCardWebServiceList(): Observable<Response<MobileListCreditCardResponse>> 

	@POST("credit-card")
	fun creditCardWebServiceCreate(@Body body: MobileCreateCreditCardRequest): Observable<Response<MobileCreateCreditCardResponse>> 

	@GET("credit-card/{id}")
	fun creditCardWebServiceGet(@Path("id") id: String?): Observable<Response<MobileGetCreditCardResponse>> 

	@PUT("credit-card/{id}")
	fun creditCardWebServiceUpdate(@Path("id") id: String?,@Body body: MobileUpdateCreditCardRequest): Observable<Response<Void>> 

	@DELETE("credit-card/{id}")
	fun creditCardWebServiceDelete(@Path("id") id: String?): Observable<Response<Void>> 

	@PUT("default-payment-method")
	fun paymentWebServiceUpdateDefaultPaymentMethod(@Body body: UpdateDefaultPaymentMethodRequest): Observable<Response<Void>> 

	@PUT("default-payment-method/check")
	fun paymentWebServiceCheckDefaultPaymentMethod(@Body body: CheckDefaultPaymentMethodRequest): Observable<Response<CheckDefaultPaymentMethodResponse>> 

	@GET("cart")
	fun cartWebServiceGet(): Observable<Response<CartView>> 

	@DELETE("cart")
	fun cartWebServiceDelete(): Observable<Response<Void>> 

	@POST("cart/item")
	fun cartWebServiceAddItem(@Body body: AddCartItemRequest): Observable<Response<CartSummaryView>> 

	@GET("cart/item/{itemId}")
	fun cartWebServiceGetItem(@Path("itemId") itemId: String?): Observable<Response<GetCartItemResponse>> 

	@PUT("cart/item/{itemId}")
	fun cartWebServiceUpdateItem(@Path("itemId") itemId: String?,@Body body: UpdateCartItemRequest): Observable<Response<Void>> 

	@DELETE("cart/item/{itemId}")
	fun cartWebServiceDeleteItem(@Path("itemId") itemId: String?): Observable<Response<CartView>> 

	@PUT("cart/promotion")
	fun cartWebServiceUpdatePromotion(@Body body: UpdateCartPromotionRequest): Observable<Response<UpdateCartPromotionResponse>> 

	@GET("cart/summary")
	fun cartWebServiceSummary(): Observable<Response<CartSummaryView>> 

	@PUT("cart/utensils")
	fun cartWebServiceUpdateUtensils(@Body body: UpdateCartUtensilsRequest): Observable<Response<UpdateCartUtensilsResponse>> 

	@GET("v2/cart")
	fun cartWebServiceV2Get(): Observable<Response<CartView>> 

	@GET("v2/cart/item/{itemId}")
	fun cartWebServiceV2GetItem(@Path("itemId") itemId: String?): Observable<Response<GetCartItemResponse>> 

	@PUT("v2/cart/item/{itemId}")
	fun cartWebServiceV2UpdateItem(@Path("itemId") itemId: String?,@Body body: UpdateCartItemRequest): Observable<Response<Void>> 

	@DELETE("v2/cart/item/{itemId}")
	fun cartWebServiceV2DeleteItem(@Path("itemId") itemId: String?): Observable<Response<CartView>> 

	@PUT("v2/cart/promotion")
	fun cartWebServiceV2UpdatePromotion(@Body body: UpdateCartPromotionRequest): Observable<Response<UpdateCartPromotionResponse>> 

	@PUT("v2/cart/utensils")
	fun cartWebServiceV2UpdateUtensils(@Body body: UpdateCartUtensilsRequest): Observable<Response<UpdateCartUtensilsResponse>> 

	@GET("order")
	fun wonderOrderWebServiceSearch(@Body body: MobileSearchOrderRequest): Observable<Response<MobileSearchOrderResponse>> 

	@GET("order/{orderId}")
	fun wonderOrderWebServiceGet(@Path("orderId") orderId: String?): Observable<Response<GetOrderResponse>> 

	@PUT("order/{orderId}/cancel")
	fun wonderOrderWebServiceCancel(@Path("orderId") orderId: String?,@Body body: CancelOrderRequest): Observable<Response<Void>> 

	@GET("order/{orderId}/item/{itemId}")
	fun wonderOrderWebServiceGetItem(@Path("orderId") orderId: String?,@Path("itemId") itemId: String?): Observable<Response<GetProductResponse>> 

	@GET("order/{orderId}/item/{itemId}/hop-up")
	fun wonderOrderWebServiceGetOrderItemHopUp(@Path("orderId") orderId: String?,@Path("itemId") itemId: String?): Observable<Response<GetOrderItemHopUpResponse>> 

	@GET("order/{orderId}/receipt")
	fun wonderOrderWebServiceGetOrderReceipt(@Path("orderId") orderId: String?): Observable<Response<GetOrderReceiptResponse>> 

	@GET("order/{orderId}/reorder")
	fun wonderOrderWebServiceGetReorder(@Path("orderId") orderId: String?): Observable<Response<GetReorderResponse>> 

	@POST("order/{orderId}/reorder")
	fun wonderOrderWebServiceReorder(@Path("orderId") orderId: String?,@Body body: ReorderRequest): Observable<Response<ReorderResponse>> 

	@PUT("order/{orderId}/reorder/check")
	fun wonderOrderWebServiceCheck(@Path("orderId") orderId: String?,@Body body: CheckReorderRequest): Observable<Response<CheckReorderResponse>> 

	@PUT("order/{orderId}/reorder/convert-to-cart")
	fun wonderOrderWebServiceEditOrder(@Path("orderId") orderId: String?): Observable<Response<Void>> 

	@POST("order/{orderId}/review")
	fun wonderOrderWebServiceReview(@Path("orderId") orderId: String?,@Body body: ReviewOrderRequest): Observable<Response<Void>> 

	@PUT("order/{orderId}/review-showed")
	fun wonderOrderWebServiceUpdateReviewShowed(@Path("orderId") orderId: String?,@Body body: UpdateReviewShowedRequest): Observable<Response<Void>> 

	@GET("order/{orderId}/status")
	fun wonderOrderWebServiceStatus(@Path("orderId") orderId: String?): Observable<Response<GetOrderStatusResponse>> 

	@POST("order/{orderId}/tip")
	fun wonderOrderWebServiceUpdateOrderTip(@Path("orderId") orderId: String?,@Body body: UpdateOrderTipRequest): Observable<Response<UpdateOrderTipResponse>> 

	@GET("order/{orderId}/tip/payment")
	fun wonderOrderWebServiceGetOrderTipPayment(@Path("orderId") orderId: String?,@Body body: GetOrderTipPaymentRequest): Observable<Response<GetOrderTipPaymentResponse>> 

	@GET("order/active")
	fun wonderOrderWebServiceListActive(): Observable<Response<ListActiveOrderResponse>> 

	@GET("order/in-progress")
	fun wonderOrderWebServiceGetOrderProgress(): Observable<Response<GetOrderProgressResponse>> 

	@PUT("order/other")
	fun wonderOrderWebServiceSearchOther(@Body body: SearchOtherOrderRequest): Observable<Response<SearchOtherOrderResponse>> 

	@GET("order/un-review")
	fun wonderOrderWebServiceGetUnReviewOrder(): Observable<Response<GetUnReviewOrderResponse>> 

	@GET("v2/order/{orderId}/reorder")
	fun wonderOrderWebServiceGetReorderV2(@Path("orderId") orderId: String?): Observable<Response<GetReorderResponseV2>> 

	@POST("v2/order/{orderId}/reorder")
	fun wonderOrderWebServiceReorderV2(@Path("orderId") orderId: String?,@Body body: ReorderRequestV2): Observable<Response<ReorderResponseV2>> 

	@PUT("v2/order/{orderId}/reorder/convert-to-cart")
	fun wonderOrderWebServiceConvertToCartV2(@Path("orderId") orderId: String?): Observable<Response<Void>> 

	@GET("checkout")
	fun checkoutWebServiceGet(): Observable<Response<GetCheckoutResponse>> 

	@PUT("checkout/address")
	fun checkoutWebServiceUpdateAddress(@Body body: UpdateCheckoutAddressRequest): Observable<Response<UpdateCheckoutAddressResponse>> 

	@PUT("checkout/check")
	fun checkoutWebServiceCheck(): Observable<Response<CheckCheckoutResponse>> 

	@POST("checkout/credit-card-payment")
	fun checkoutWebServiceAddCreditCardPayment(@Body body: AddCreditCardPaymentRequest): Observable<Response<AddCreditCardPaymentResponse>> 

	@POST("checkout/order")
	fun checkoutWebServicePlaceOrder(@Body body: PlaceOrderRequest): Observable<Response<PlaceOrderResponse>> 

	@PUT("checkout/payment")
	fun checkoutWebServiceUpdatePayment(@Body body: UpdateCheckoutPaymentRequest): Observable<Response<UpdateCheckoutPaymentResponse>> 

	@GET("checkout/refresh")
	fun checkoutWebServiceRefresh(): Observable<Response<RefreshCheckoutResponse>> 

	@POST("checkout/shipping-address")
	fun checkoutWebServiceAddShippingAddress(@Body body: AddAddressRequest): Observable<Response<AddAddressResponse>> 

	@PUT("checkout/tip")
	fun checkoutWebServiceUpdateTip(@Body body: UpdateCheckoutTipRequest): Observable<Response<UpdateCheckoutTipResponse>> 

	@GET("v2/checkout")
	fun checkoutWebServiceV2Get(): Observable<Response<GetCheckoutResponse>> 

	@PUT("v2/checkout/address")
	fun checkoutWebServiceV2UpdateAddress(@Body body: UpdateCheckoutAddressRequest): Observable<Response<UpdateCheckoutAddressResponse>> 

	@PUT("v2/checkout/check")
	fun checkoutWebServiceV2Check(): Observable<Response<CheckCheckoutResponse>> 

	@POST("v2/checkout/order")
	fun checkoutWebServiceV2PlaceOrder(@Body body: PlaceOrderRequest): Observable<Response<PlaceOrderResponse>> 

	@PUT("v2/checkout/payment")
	fun checkoutWebServiceV2UpdatePayment(@Body body: UpdateCheckoutPaymentRequest): Observable<Response<UpdateCheckoutPaymentResponse>> 

	@PUT("v2/checkout/tip")
	fun checkoutWebServiceV2UpdateTip(@Body body: UpdateCheckoutTipRequest): Observable<Response<UpdateCheckoutTipResponse>> 

	@GET("fulfillment/{fulfillmentId}/route")
	fun wonderFulfillmentWebServiceRoute(@Path("fulfillmentId") fulfillmentId: String?): Observable<Response<GetFulfillmentRouteResponse>> 

	@GET("fulfillment/{fulfillmentId}/status")
	fun wonderFulfillmentWebServiceStatus(@Path("fulfillmentId") fulfillmentId: String?): Observable<Response<GetFulfillmentStatusResponse>> 

	@POST("promotion")
	fun wonderPromotionWebServiceAdd(@Body body: AddPromotionRequest): Observable<Response<Void>> 

	@GET("promotion/list")
	fun wonderPromotionWebServiceList(): Observable<Response<ListPromotionResponse>> 


}