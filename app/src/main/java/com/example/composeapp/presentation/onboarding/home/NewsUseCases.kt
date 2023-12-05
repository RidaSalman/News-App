package com.example.composeapp.presentation.onboarding.home

import com.example.composeapp.domain.manager.usecases.app_entry.news.GetNews

data class NewsUseCases(
    val getNews: GetNews,
    /*val searchNews: SearchNews*/
)
