package com.artimanton.bsx_artim.model


import com.google.gson.annotations.SerializedName

data class Posts(
    @SerializedName("code")
    val code: Int,
    @SerializedName("data")
    val `data`: List<Data>,
    @SerializedName("meta")
    val meta: Meta
)