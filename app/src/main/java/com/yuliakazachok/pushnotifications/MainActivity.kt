package com.yuliakazachok.pushnotifications

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.yuliakazachok.pushnotifications.ui.theme.PushNotificationsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PushNotificationsTheme {
            }
        }
    }
}