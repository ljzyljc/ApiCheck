package com.jackie.createapidemo.anno.model.faq

import com.google.gson.annotations.SerializedName

/**
 * Description:
 * @author lrc19860926@gmail.com
 * @date 2019-05-06 17:20
 */
data class FAQModel(
    @SerializedName("question")
    val title: String?,
    @SerializedName("answer")
    val desc: String?
)
