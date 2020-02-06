package com.jackie.createapidemo

import com.google.gson.annotations.SerializedName
import java.io.Serializable

/**
 * Description:
 * @author lrc19860926@gmail.com
 * @date 2019-05-10 18:03
 */
data class AddressModel(
    @SerializedName("id")
    val id: String?,
    @SerializedName("first_name")
    val firstName: String?,
    @SerializedName("last_name")
    val lastName: String?,
    @SerializedName("address1")
    val street: String?,
    @SerializedName("address2")
    val apartment: String?,
    @SerializedName("city")
    val city: String?,
    @SerializedName("state")
    val state: String?,
    @SerializedName("state_code")
    val stateCode: String?,
    @SerializedName("zip_code")
    val zipCode1: String?,
    @SerializedName("company")
    val company: String?,
    @SerializedName("phone")
    val phone: String?,
    @SerializedName("country")
    val country: String?,
    @SerializedName("country_code")
    val countryCode: String?,
    @SerializedName("default_address")
    val isDefault: Boolean?
) : Serializable {

    fun getNameLine(): String {
        val sb = StringBuilder()
        if (!firstName.isNullOrEmpty()) {
            sb.append(firstName)
            sb.append(" ")
        }

        if (!lastName.isNullOrEmpty()) {
            sb.append(lastName)
        }
        return sb.toString()
    }

    fun getCityLine(): String {

        val sb = StringBuilder()
        if (!city.isNullOrEmpty()) {
            sb.append(city)
        }

        if (!state.isNullOrEmpty()) {
            sb.append(", ")
            sb.append(state)
        }

        if (!zipCode1.isNullOrEmpty()) {
            sb.append(", ")
            sb.append(zipCode1)
        }
        return sb.toString()
    }
}
