package com.yuliakazachok.pushnotifications.notification

import android.content.Context
import android.util.Log
import com.google.firebase.messaging.FirebaseMessaging
import com.yuliakazachok.pushnotifications.R
import com.yuliakazachok.pushnotifications.util.LOG_TAG

fun subscribeToInterestingTopic(context: Context) {
	FirebaseMessaging.getInstance().subscribeToTopic(context.getString(R.string.topic_interesting)).addOnCompleteListener { task ->
		if (task.isSuccessful) {
			Log.d(LOG_TAG, "Subscribed")
		} else {
			Log.d(LOG_TAG, "Subscribe failed")
		}
	}
}

fun unsubscribeToInterestingTopic(context: Context) {
	FirebaseMessaging.getInstance().unsubscribeFromTopic(context.getString(R.string.topic_interesting)).addOnCompleteListener { task ->
		if (task.isSuccessful) {
			Log.d(LOG_TAG, "Unsubscribed")
		} else {
			Log.d(LOG_TAG, "Unsubscribe failed")
		}
	}
}
