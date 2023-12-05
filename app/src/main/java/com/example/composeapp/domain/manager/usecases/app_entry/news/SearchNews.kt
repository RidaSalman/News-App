package com.example.composeapp.domain.manager.usecases.app_entry.news

import androidx.paging.PagingData
import com.example.composeapp.domain.manager.model.Article
import com.example.composeapp.domain.manager.repository.NewsRepository
import kotlinx.coroutines.flow.Flow

class SearchNews(
    private val newsRepository: NewsRepository
) {
    operator fun invoke(searchQuery: String, sources: List<String>): Flow<PagingData<Article>> {
        return newsRepository.searchNews(
            searchQuery = searchQuery,
            sources = sources
        )
    }
}