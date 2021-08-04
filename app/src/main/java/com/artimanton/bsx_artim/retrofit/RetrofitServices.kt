package com.artimanton.wiki.retrofit

import com.artimanton.bsx_artim.model.Posts
import retrofit2.Call
import retrofit2.http.*

interface RetrofitServices {
        @GET("/posts")
        fun getCharacter(): Call<Posts>
}