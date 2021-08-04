package com.artimanton.bsx_artim.model


import com.google.gson.annotations.SerializedName

data class Data(
    @SerializedName("body")
    val body: String,
    @SerializedName("id")
    val id: Int,
    @SerializedName("title")
    val title: String,
    @SerializedName("user_id")
    val userId: Int
)