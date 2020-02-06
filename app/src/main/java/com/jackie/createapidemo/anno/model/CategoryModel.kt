package com.jackie.createapidemo

import com.google.gson.annotations.SerializedName
import java.io.Serializable

/**
 * Description:
 * @author lrc19860926@gmail.com
 * @date 2019-04-29 15:56
 */
open class CategoryModel(
    @SerializedName("name")
    val name: String?,
    @SerializedName("image_url")
    val imgUrl: String?,
    // 需要调用getUrlSearchPath()
    @SerializedName("action_url")
    val actionUrl: String?,
    // id
    @SerializedName("nav_id")
    val id: String?,
    @SerializedName("sub_navs")
    val childList: List<CategoryModel>?,

    // 跳转到可滑动的页面
    @SerializedName("next_is_leaf_node")
    val isAllChildLeaf: Boolean?)

