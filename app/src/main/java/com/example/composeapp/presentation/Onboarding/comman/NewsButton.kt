package com.example.composeapp.presentation.Onboarding.comman

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun NewsButton(
    text: String,
    onClick:()->Unit
){
    Button(onClick = onClick, colors = ButtonDefaults.buttonColors(
        containerColor = MaterialTheme.colorScheme.primary,
        contentColor = Color.White
    ),
        shape = RoundedCornerShape(size = 6.dp)
    ) {
        
    }
}