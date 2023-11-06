package com.example.composeapp.presentation.onboarding

import androidx.annotation.DrawableRes
import com.example.composeapp.R

data class Page(
    val title : String,
    val description : String,
    @DrawableRes val image : Int
)

val pages = listOf(
    Page("Stay Updated ", "Get the latest news and updates from around the world.",
        R.drawable.stay_updated
    ),
    Page("Personalized Content", "Receive personalized content tailored to your interests.",
        R.drawable.personalized_content),
    Page("Save for Later ", "Bookmark articles to read later at your convenience.",R.drawable.save_for_lates),
    Page(
        "Discover Top Stories ", "Explore the top stories and trending news from various categories.",
        R.drawable.top_stories
    )
)