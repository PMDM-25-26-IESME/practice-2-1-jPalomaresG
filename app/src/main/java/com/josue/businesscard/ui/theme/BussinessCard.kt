package com.josue.businesscard.ui.theme


import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.Alignment
import androidx.compose.ui.unit.dp

@Composable
fun BusinessCard(
    name: String,
    job: String,
    phone: String,
    socialMedia: String,
    email: String,
    image: Int
) {
    Column(
        modifier = Modifier.fillMaxSize().padding(16.dp),
        verticalArrangement = Arrangement.SpaceBetween,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        ProfileImage(imageRes = image)
        InfoSection(name = name, job = job)
        ContactSection(phone = phone, socialMedia = socialMedia, email = email)
    }
}