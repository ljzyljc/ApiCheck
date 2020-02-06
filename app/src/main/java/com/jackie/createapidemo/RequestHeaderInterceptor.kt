package com.jackie.createapidemo

import android.net.Uri
import java.nio.charset.StandardCharsets
import okhttp3.Interceptor
import okhttp3.Request
import okhttp3.Response
import okio.Buffer
import wu.seal.jsontokotlin.utils.LogUtil

class RequestHeaderInterceptor : Interceptor {
    override fun intercept(chain: Interceptor.Chain): Response {

        val original = chain.request()
//        val hmacBefore = getHMACString(original)
//        LogUtil.e("hmac=before=$hmacBefore")
        val hmacAfter = ""
//        LogUtil.e("hmac=after=$hmacAfter")

        val request = original.newBuilder()
            .header("accept", "application/json")
            .header("content-type", "application/json")
            .header("clientVersion", "1.0.9")
            .header("x-client-id", "6096c36c08764700ab58d5afe6c2256a")
            .header("x-session-token", "31df8eec-309c-4788-9029-17d4f92ad40e")
            .header("x-hmac", "NzybAyQEZrc0KffwECFxIAQY4vDopHXT3o9HMIqhzhY=")
            .header("x-anonymous", false.toString())
            .header("platform", "android")
            .build()

        //LogUtil.d("header=${request.headers()}")
        return chain.proceed(request)
    }



}
