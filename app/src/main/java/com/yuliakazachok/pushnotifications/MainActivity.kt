package com.yuliakazachok.pushnotifications

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.google.firebase.messaging.FirebaseMessaging
import com.yuliakazachok.pushnotifications.notification.subscribeToInterestingTopic
import com.yuliakazachok.pushnotifications.notification.unsubscribeToInterestingTopic
import com.yuliakazachok.pushnotifications.ui.screen.ContentScreen
import com.yuliakazachok.pushnotifications.ui.theme.PushNotificationsTheme
import com.yuliakazachok.pushnotifications.util.LOG_TAG

class MainActivity : ComponentActivity() {

	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)

		FirebaseMessaging.getInstance().token.addOnCompleteListener { task ->
			if (!task.isSuccessful) {
				return@addOnCompleteListener
			}

			val token = task.result
			Log.d(LOG_TAG, "token = $token")
		}

		setContent {
			PushNotificationsTheme {
				ContentScreen(
					onSubscribeClick = { subscribeToInterestingTopic(applicationContext) },
					onUnsubscribeClick = { unsubscribeToInterestingTopic(applicationContext) },
				)
			}
		}
	}
}