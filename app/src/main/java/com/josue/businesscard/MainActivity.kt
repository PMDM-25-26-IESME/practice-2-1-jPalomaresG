package com.josue.businesscard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.josue.businesscard.ui.theme.BusinessCard
import com.josue.businesscard.ui.theme.BusinessCardTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BusinessCardTheme {
                BusinessCard(
                    name = "Ricardo Sánchez",
                    job = "IT Teacher",
                    phone = "+34 555 66 77 88",
                    socialMedia = "@mymedia",
                    email = "myemail@mail.com",
                    image = R.drawable.android_logo
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun BusinessCardPreview() {
    BusinessCardTheme {
        BusinessCard(
            name = "Ricardo Sánchez",
            job = "IT Teacher",
            phone = "+34 555 66 77 88",
            socialMedia = "@mymedia",
            email = "myemail@mail.com",
            image = R.drawable.android_logo
        )
    }
}