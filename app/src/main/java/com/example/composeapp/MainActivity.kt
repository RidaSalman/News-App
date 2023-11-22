package com.example.composeapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.material3.MaterialTheme
import androidx.compose.ui.Modifier
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen

import com.example.composeapp.presentation.onboarding.components.OnBoardingScreen
import com.example.composeapp.ui.theme.ComposeAppTheme


class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        /*WindowCompat.setDecorFitsSystemWindows(window,false)
        WindowCompat.setDecorFitsSystemWindows(window,false)*/
        installSplashScreen()
        setContent {
            ComposeAppTheme {
                Box(modifier = Modifier.background(color = MaterialTheme.colorScheme.background)) {
                    OnBoardingScreen()
                }

            }
        }
    }
}




