package com.yuliakazachok.pushnotifications.notification

import android.util.Log
import com.google.firebase.messaging.FirebaseMessagingService
import com.google.firebase.messaging.RemoteMessage
import com.yuliakazachok.pushnotifications.util.LOG_TAG

class MessageService : FirebaseMessagingService() {

	override fun onNewToken(token: String) {
		super.onNewToken(token)

		Log.d(LOG_TAG, "New token = $token")
	}

	override fun onMessageReceived(message: RemoteMessage) {
		super.onMessageReceived(message)

		Log.d(LOG_TAG, "Message received")

		message.data.forEach {
			Log.d(LOG_TAG, "Message = key \"${it.key}\", value \"${it.value}\"")
		}
	}
}