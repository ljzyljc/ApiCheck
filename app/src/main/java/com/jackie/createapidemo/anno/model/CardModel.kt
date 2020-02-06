package com.jackie.createapidemo

import com.google.gson.annotations.SerializedName

/**
 * Description:
 * @author lrc19860926@gmail.com
 * @date 2019-05-10 18:04
 */
data class CardModel(
    @SerializedName("credit_card_type")
    val type: String?,
    @SerializedName("credit_card_last_four_digits")
    val lastFourNumber: String?,
    @SerializedName("credit_card_expire_date")
    val expireDate: String?,
    @SerializedName("first_name")
    val ownerFirstName: String?,
    @SerializedName("last_name")
    val ownerLastName: String?,
    @SerializedName("address1")
    val ownerAddress1: String?,
    @SerializedName("address2")
    val ownerAddress2: String?,
    @SerializedName("city")
    val ownerCity: String?,
    @SerializedName("state")
    val ownerState: String?,
    @SerializedName("zip_code")
    val ownerZipCode: String?
) {

    fun getNameLine(): String {
        val sb = StringBuilder()
        if (!ownerFirstName.isNullOrEmpty()) {
            sb.append(ownerFirstName)
        }

        if (!ownerLastName.isNullOrEmpty()) {
            sb.append(" ")
            sb.append(ownerLastName)
        }
        return sb.toString()
    }

    fun getCityLine(): String {

        val sb = StringBuilder()
        if (!ownerCity.isNullOrEmpty()) {
            sb.append(ownerCity)
        }

        if (!ownerState.isNullOrEmpty()) {
            sb.append(", ")
            sb.append(ownerState)
        }

        if (!ownerZipCode.isNullOrEmpty()) {
            sb.append(", ")
            sb.append(ownerZipCode)
        }
        return sb.toString()
    }
}
