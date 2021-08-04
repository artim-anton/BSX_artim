package com.artimanton.bsx_artim.model


import com.google.gson.annotations.SerializedName

data class Meta(
    @SerializedName("pagination")
    val pagination: Pagination
)