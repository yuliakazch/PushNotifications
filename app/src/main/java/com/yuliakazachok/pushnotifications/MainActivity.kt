package com.yuliakazachok.pushnotifications

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.google.firebase.messaging.FirebaseMessaging
import com.yuliakazachok.pushnotifications.notification.logToken
import com.yuliakazachok.pushnotifications.notification.subscribeToInterestingTopic
import com.yuliakazachok.pushnotifications.notification.unsubscribeToInterestingTopic
import com.yuliakazachok.pushnotifications.ui.screen.ContentScreen
import com.yuliakazachok.pushnotifications.ui.theme.PushNotificationsTheme

class MainActivity : ComponentActivity() {

	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)

		val firebaseMessaging = FirebaseMessaging.getInstance()
		firebaseMessaging.logToken()

		setContent {
			PushNotificationsTheme {
				ContentScreen(
					onSubscribeClick = { firebaseMessaging.subscribeToInterestingTopic(applicationContext) },
					onUnsubscribeClick = { firebaseMessaging.unsubscribeToInterestingTopic(applicationContext) },
				)
			}
		}
	}
}