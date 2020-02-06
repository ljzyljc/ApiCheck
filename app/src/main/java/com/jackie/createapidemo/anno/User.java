package com.jackie.createapidemo.anno;

import com.google.gson.annotations.SerializedName;

/**
 * Description:
 *
 * @author feifei5292190@gmail.com
 * @date 2020-01-21
 */
    @ConsAnnotation(request = { "hello","world","annotation!" })
    public class User {

        @Fields("中华人民共和国")
        private String userName;


    @Fields("测试")
    private String name;

    @SerializedName("seriable_length")
    public String length;

    public String getLength() {
        return length;
    }

    public void setLength(String length) {
        this.length = length;
    }

    public String getUserName() {
            return userName;
        }

        public void setUserName(String userName) {
            this.userName = userName;
        }
}
