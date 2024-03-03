package com.alex.eyk.imbridge

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

class SignInViewModel : ViewModel() {

    private val _email = MutableStateFlow(TextFieldState(""))
    val email: StateFlow<TextFieldState> = _email

    fun onEmailUpdated(email: String) {
        this._email.value = TextFieldState(
            value = email,
            error = if (email.length > 10) {
                "Слишком длинный email"
            } else {
                null
            },
        )
    }
}

data class TextFieldState(
    val value: String,
    val error: String? = null,
)
