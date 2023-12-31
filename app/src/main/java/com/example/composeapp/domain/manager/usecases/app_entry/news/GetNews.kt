package com.example.composeapp.domain.manager.usecases.app_entry.news

import androidx.paging.PagingData
import com.example.composeapp.domain.manager.model.Article
import com.example.composeapp.domain.manager.repository.NewsRepository
import kotlinx.coroutines.flow.Flow

class GetNews(
    private val newsRepository: NewsRepository
) {
    operator fun invoke(sources: List<String>): Flow<PagingData<Article>> {
        return newsRepository.getNews(sources = sources)
    }
}