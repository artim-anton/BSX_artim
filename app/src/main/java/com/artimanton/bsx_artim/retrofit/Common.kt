package com.artimanton.wiki.retrofit


object Common {
    private val BASE_URL = "https://gorest.co.in/public-api"
    val retrofitService: RetrofitServices
        get() = RetrofitClient.getClient(BASE_URL).create(RetrofitServices::class.java)
}