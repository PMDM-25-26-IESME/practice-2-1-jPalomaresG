package com.josue.businesscard.ui.theme

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import androidx.compose.ui.Alignment

@Composable
fun InfoSection(name: String, job: String) {
    Column(horizontalAlignment = Alignment.CenterHorizontally) {
        Text(text = name, fontSize = 24.sp, fontWeight = FontWeight.Bold)
        Text(text = job, fontSize = 16.sp)
    }
}