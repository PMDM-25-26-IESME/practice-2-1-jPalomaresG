package com.josue.businesscard.ui.theme

import androidx.compose.foundation.Image
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.foundation.layout.size

@Composable
fun ProfileImage(imageRes: Int) {
    Image(
        painter = painterResource(id = imageRes),
        contentDescription = "Profile picture",
        modifier = Modifier.size(120.dp)
    )
}