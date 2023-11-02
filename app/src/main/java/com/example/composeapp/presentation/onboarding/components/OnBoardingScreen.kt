package com.example.composeapp.presentation.onboarding.components

import android.annotation.SuppressLint import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.PagerState
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.derivedStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composeapp.presentation.onboarding.pages
import com.example.composeapp.ui.theme.ComposeAppTheme


@SuppressLint("RememberReturnType")
@Composable
fun OnBoardingScreen() {
    Column(modifier = Modifier.fillMaxSize()) {
        val pagerState = remember { mutableStateOf(0) }

        val buttonState = remember(pagerState.value) {
            when (pagerState.value) {
                0 -> listOf("", "Next")
                1 -> listOf("Back", "Next")
                2 -> listOf("Back", "Next")
                3 -> listOf("Back", "GetStarted")
                else -> listOf("", "")
            }
        }

        LazyColumn {
            items(pages) { page ->
                OnBoardingPage(page = page)
            }
        }
        Spacer(modifier = Modifier.weight(1f))
        Row (modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 24.dp)
            .navigationBarsPadding(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically){

            PageIndicator(modifier = Modifier.width(52.dp), pageSize = pages.size, selectedPage = pagerState.value)

        }
    }
}

@Preview(showBackground = true)
@Composable
fun OnBoardingScreenPreview() {
    ComposeAppTheme {
        OnBoardingScreen()
    }
}
