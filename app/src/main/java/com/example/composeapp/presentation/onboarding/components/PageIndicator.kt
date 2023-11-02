package com.example.composeapp.presentation.onboarding.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composeapp.ui.theme.BlueGray
import com.example.composeapp.ui.theme.ComposeAppTheme


@Composable
fun PageIndicator(
    modifier: Modifier = Modifier,
    pageSize : Int,
    selectedPage : Int,
    selectedColor : Color = MaterialTheme.colorScheme.primary,
    unselectedColor : Color = BlueGray
){
    Row(modifier = Modifier,
        horizontalArrangement = Arrangement.SpaceBetween) {
        repeat(pageSize){
            page -> Box(modifier = Modifier.size(14.dp).clip(CircleShape).background(color = if(page == selectedPage) selectedColor else unselectedColor))
        }


    }

}

