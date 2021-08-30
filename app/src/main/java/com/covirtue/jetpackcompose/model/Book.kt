package com.covirtue.jetpackcompose.model

import kotlinx.serialization.Serializable

@Serializable
data class Book(
    val longDescription: String = "",
    @Transient val pageCount: Int = 0,
    val isbn: String = "",
    val publishedDate: PublishedDate,
    val shortDescription: String = "",
    val categories: List<String> = emptyList(),
    val title: String = "",
    val thumbnailUrl: String = "",
    @Transient val status: String = "",
    val authors: List<String> = emptyList()
)