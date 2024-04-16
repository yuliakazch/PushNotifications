package com.yuliakazachok.pushnotifications.ui.screen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.yuliakazachok.pushnotifications.R

@Composable
fun ContentScreen(
	onSubscribeClick: () -> Unit,
	onUnsubscribeClick: () -> Unit,
) {
	Column(
		modifier = Modifier.fillMaxSize(),
		verticalArrangement = Arrangement.Center,
		horizontalAlignment = Alignment.CenterHorizontally,
	) {
		Button(
			modifier = Modifier.padding(bottom = 8.dp),
			onClick = onSubscribeClick,
		) {
			Text(stringResource(R.string.button_text_subscribe_to_interesting))
		}

		Button(
			modifier = Modifier.padding(bottom = 8.dp),
			onClick = onUnsubscribeClick,
		) {
			Text(stringResource(R.string.button_text_unsubscribe_to_interesting))
		}
	}
}