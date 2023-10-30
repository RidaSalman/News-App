package com.example.composeapp.presentation.Onboarding.components

import android.content.res.Configuration.UI_MODE_NIGHT_YES
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.modifier.ModifierLocal
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composeapp.R
import com.example.composeapp.presentation.Onboarding.Page
import com.example.composeapp.presentation.Onboarding.pages
import com.example.composeapp.ui.theme.ComposeAppTheme

@Composable
fun OnBoardingPage(
    modifier : Modifier = Modifier,
    page : Page
) {
    Column(modifier = modifier) {
        Image(
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight(fraction = 0.6f),
            painter = painterResource(id = page.image),
            contentDescription = null,
            contentScale = ContentScale.Crop
            )
        Spacer(modifier = Modifier.height(24.dp)
        )
        Text(text = page.title,
            modifier = Modifier.padding(horizontal = 24.dp),
            style = MaterialTheme.typography.displaySmall.copy(fontWeight = FontWeight.Bold),
            color = colorResource(id = R.color.display_small)
        )
        Text(text = page.description,
            modifier = Modifier.padding(horizontal = 24.dp),
            style = MaterialTheme.typography.bodyMedium,
            color = colorResource(id = R.color.text_medium)
        )

    }
}

@Preview(showBackground = true)
@Preview(uiMode = UI_MODE_NIGHT_YES, showBackground = true)
@Composable
fun OnBoardingPagePreview(){
    ComposeAppTheme {
        OnBoardingPage(page = pages[0])
    }
}