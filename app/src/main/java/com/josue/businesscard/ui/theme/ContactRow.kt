package com.josue.businesscard.ui.theme

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp

@Composable
fun ContactRow(icon: ImageVector, text: String, modifier: Modifier = Modifier) {
    Row(modifier = modifier.padding(8.dp)) {
        Icon(imageVector = icon, contentDescription = null)
        Text(text = text, modifier = Modifier.padding(start = 8.dp))
    }
}