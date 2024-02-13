package com.example.socialfeed_hw21.data.model


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class PostDto(
    val id: Int,
    val images: List<String>?,
    val title: String,
    val comments: Int,
    val likes: Int,
    @Json(name = "share_content")
    val shareContent: String,
    val owner: OwnerDto
)

@JsonClass(generateAdapter = true)
data class OwnerDto(
    @Json(name = "first_name")
    val firstName: String,
    @Json(name = "last_name")
    val lastName: String,
    val profile: String?,
    @Json(name = "post_date")
    val postDate: Long
)