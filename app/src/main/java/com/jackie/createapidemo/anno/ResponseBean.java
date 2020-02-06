package com.jackie.createapidemo.anno;

import com.google.gson.annotations.SerializedName;

/**
 * Description:
 *
 * @author feifei5292190@gmail.com
 * @date 2020-01-21
 */
public class ResponseBean {

    @Fields("测试")
    private String name;

    @SerializedName("seriable_length")
    private String length;
}
