package com.jackie.createapidemo


/**
 * Description:
 * @author lrc19860926@gmail.com
 * @date 2019-04-28 16:05
 */
object ParamsUtil {

//    fun addCart(productCode: String?, sku: String?, quantity: Int = 1): CartAddListModel {
//
//        val list = mutableListOf<CartAddModel>()
//        val cartAddModel = CartAddModel(productCode, sku, quantity)
//        list.add(cartAddModel)
//        return addCart(list)
//    }
//
//    fun addCart(list: List<CartAddModel>): CartAddListModel {
//        return CartAddListModel(list)
//    }

    fun updateCart(productCode: String?, sku: String?, quantity: Int = 1): HashMap<String, Any?> {
        val params = hashMapOf<String, Any?>()
        params["product_code"] = productCode
        params["sku"] = sku
        params["quantity"] = quantity
        return params
    }

//    fun createSession(): HashMap<String, Any?> {
//        val params = hashMapOf<String, Any?>()
//        params["device_id"] = YBDeviceUtil.uniqueId
//        params["session_token"] =
//            YBStringUtil.getDefaultNullString(SessionManager.getSessionToken())
//        params["firebase_messaging_token"] =
//            YBStringUtil.getDefaultNullString(SessionManager.getMessagingToken())
//
//        params["os"] = YBDeviceUtil.getDevicePlatform()
//        params["app_version"] = BuildConfig.VERSION_NAME
//        params["os_version"] = YBDeviceUtil.getDeviceAndroidVersion()
//        params["language"] = YBDeviceUtil.getDeviceDefaultLanguage()
//        params["model_name"] = YBDeviceUtil.getDeviceModel()
//        params["cpu"] = YBDeviceUtil.getCpuName()
//        params["manufacturer"] = YBDeviceUtil.getDeviceManufacturer()
//        return params
//    }

    fun createSession(): HashMap<String, Any?> {
        val params = hashMapOf<String, Any?>()
        params["device_id"] = "sdlfjdskjfls"
        params["session_token"] =
                "sdlfjdsksdfjfls"
        params["firebase_messaging_token"] =
                "sdlfjdskjfls"

        params["os"] = "sdlfjdskjsdfsfls"
        params["app_version"] = BuildConfig.VERSION_NAME
        params["os_version"] = "sdlfjdskjfls"
        params["language"] = "sdlfjdskjfls"
        params["model_name"] = "sdlfjdsksdfsjfls"
        params["cpu"] = "sdlfjdsksdfjfls"
        params["manufacturer"] = "sdlfjdskjfls"
        return params
    }

    fun register(
        email: String?,
        referralCode: String?,
        shopifyUserId: String?

    ): HashMap<String, Any?> {
        val params = hashMapOf<String, Any?>()
        params["email"] = email
        if (!referralCode.isNullOrBlank()) {
            params["advocate_referral_code"] = referralCode
        } else {
            params["advocate_referral_code"] = null
        }
        params["shopify_customer_id"] = shopifyUserId
        return params
    }

    fun login(
        email: String?,
        shopifyUserId: String?
    ): HashMap<String, Any?> {
        val params = hashMapOf<String, Any?>()
        params["email"] = email
        params["shopify_customer_id"] = shopifyUserId
        return params
    }

    fun addAddress(
        firstName: String?,
        lastName: String?,
        company: String?,
        street: String?,
        apt: String?,
        city: String?,
        status: String?,
        statusCode: String?,
        zipcode: String?,
        phone: String?,
        country: String?,
        countryCode: String?,
        isDefault: Boolean
    ): HashMap<String, Any?> {
        val params = hashMapOf<String, Any?>()
        params["first_name"] = firstName
        params["last_name"] = lastName
        params["address1"] = street
        params["address2"] = apt
        params["city"] = city
        params["state"] = status
        params["state_code"] = statusCode
        params["zip_code"] = zipcode
        params["company"] = company
        params["phone"] = phone
        params["default_address"] = isDefault
        if (!country.isNullOrBlank()) {
            params["country"] = country
        }
        if (!countryCode.isNullOrBlank()) {
            params["country_code"] = countryCode
        }
        return params
    }

    fun categoryList(urlPath: String?): HashMap<String, Any?> {
        return productListSearch(
            null,
            urlPath,
            null,
            null,
            null,
            null,
            null,
            null,
            null,
            0,
            null
        )
    }

    fun productList(
        keyword: String?,
        actionUrl: String?,
        pageIndex: Int,
        sortBy: String?,
        regionList: List<String?>?,
        brandList: List<String?>?,
        categoryList: List<String?>?,
        dietList: List<String?>?,
        minPrice: String?,
        maxPrice: String?
    ): HashMap<String, Any?> {
        return productListSearch(
            keyword,
            actionUrl,
            regionList,
            brandList,
            dietList,
            categoryList,
            minPrice,
            maxPrice,
            null,
            pageIndex,
            sortBy
        )
    }

    fun favoritesList(
        pageIndex: Int,
        categoryIds: List<String?>?
    ): HashMap<String, Any?> {
        val params = hashMapOf<String, Any?>()
        params["nav_ids"] = categoryIds
        params["page_index"] = pageIndex
        params["page_size"] = 20
        return params
    }

    fun notificationSettings(
        marketing: Boolean
    ): HashMap<String, Any?> {
        val params = hashMapOf<String, Any?>()
        params["marketing_notification"] = marketing
        return params
    }

    fun updateReadState(messageId: String?, action: String): HashMap<String, Any?> {
        val params = hashMapOf<String, Any?>()
        params["message_id"] = messageId
        params["action"] = action
        return params
    }

    private fun productListSearch(
        query: String?,
        urlPath: String?,
        regions: List<String?>?,
        brands: List<String?>?,
        diets: List<String?>?,
        navs: List<String?>?,
        minPrice: String?,
        maxPrice: String?,
        zipCode: String?,
        pageIndex: Int,
        sortBy: String?
    ): HashMap<String, Any?> {
        val params = hashMapOf<String, Any?>()
        params["query"] = query
        params["prior_filters"] = urlPath
        params["regions"] = regions ?: arrayListOf<String>()
        params["brands"] = brands ?: arrayListOf<String>()
        params["diets"] = diets ?: arrayListOf<String>()
        @Suppress("RemoveExplicitTypeArguments")
        params["navs"] = navs ?: arrayListOf<String>()
        params["min_price"] = minPrice
        params["max_price"] = maxPrice
        params["zip_code"] = zipCode
        params["page_index"] = pageIndex
        params["sort_by"] = sortBy
        return params
    }

//    fun cart(productList: List<CartProductModel>?, freebieList: List<CartFreebieModel>?):
//        HashMap<String, Any?> {
//        val params = hashMapOf<String, Any?>()
//        params["cart_items"] = productList
//        params["freebie_items"] = freebieList
//        return params
//    }

    fun notifyMe(
        code: String?,
        sku: String?
    ): HashMap<String, Any?> {
        val params = hashMapOf<String, Any?>()
        params["code"] = code
        params["sku"] = sku
        return params
    }

    fun editProfile(
        firstName: String?,
        lastName: String?,
        icon: String?
    ): HashMap<String, Any?> {
        val params = hashMapOf<String, Any?>()
        params["first_name"] = firstName
        params["last_name"] = lastName
        if (!icon.isNullOrBlank()) {
            params["avatar_image_base64"] = icon
        }
        return params
    }

    fun addReview(
        content: String?,
        title: String?,
        score: Float?
    ): HashMap<String, Any?> {
        val params = hashMapOf<String, Any?>()
        params["content"] = content
        params["title"] = title
        params["score"] = score
        return params
    }

//    fun saveBirthday(
//        month: Int,
//        day: Int,
//        year: Int
//    ): HashMap<String, Any?> {
//        val params = hashMapOf<String, Any?>()
//        params["birth_date"] = YBDateUtil.formatToBirthdayServer(year, month, day)
//        return params
//    }

    fun redeemPoint(
        id: String?
    ): HashMap<String, Any?> {
        val params = hashMapOf<String, Any?>()
        params["id"] = id
        return params
    }

//    fun uploadMessagingToken(): java.util.HashMap<String, Any?> {
//        val params = hashMapOf<String, Any?>()
//        params["token"] = SessionManager.getMessagingToken()
//        return params
//    }
}
