package com.alex.eyk.imbridge

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun SignInScreen(
    viewModel: SignInViewModel = remember { SignInViewModel() }
) {
    val emailFieldState by viewModel.email.collectAsState()

    Box(
        modifier = Modifier
            .fillMaxSize(),
    ) {
        Column(
            modifier = Modifier
                .align(Alignment.Center),
        ) {
            TextField(
                value = emailFieldState.value,
                onValueChange = { viewModel.onEmailUpdated(it) },
                isError = emailFieldState.error != null,
            )
            Text(
                text = emailFieldState.error.orEmpty(),
                modifier = Modifier
                    .padding(top = 8.dp),
                color = Color.Red,
            )
        }
    }
}
