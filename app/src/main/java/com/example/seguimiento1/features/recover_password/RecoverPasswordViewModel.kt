package com.example.seguimiento1.features.recover_password

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

class RecoverPasswordViewModel : ViewModel() {

    private val _email = MutableStateFlow("")
    val email: StateFlow<String> = _email

    fun onEmailChange(value: String) {
        _email.value = value
    }

    fun recover(): Boolean {
        return email.value.isNotEmpty()
    }
}