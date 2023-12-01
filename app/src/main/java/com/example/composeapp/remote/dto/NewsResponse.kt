package com.example.composeapp.remote.dto

import com.example.composeapp.domain.manager.model.Article

data class NewsResponse(
    val articles: List<Article>,
    val status: String,
    val totalResults: Int
)