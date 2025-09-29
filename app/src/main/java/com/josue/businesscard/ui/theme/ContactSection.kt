package com.josue.businesscard.ui.theme

import androidx.compose.foundation.layout.Column
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material.icons.filled.Share
import androidx.compose.runtime.Composable

@Composable
fun ContactSection(phone: String, socialMedia: String, email: String) {
    Column {
        ContactRow(icon = Icons.Default.Phone, text = phone)
        ContactRow(icon = Icons.Default.Share, text = socialMedia)
        ContactRow(icon = Icons.Default.Email, text = email)
    }
}