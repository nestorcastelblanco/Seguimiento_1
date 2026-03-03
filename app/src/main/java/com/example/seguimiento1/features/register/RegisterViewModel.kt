package com.example.seguimiento1.features.register

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow

class RegisterViewModel : ViewModel() {

    var ciudad = MutableStateFlow("")
        private set
    var email = MutableStateFlow("")
        private set
    var nombre = MutableStateFlow("")
        private set
    var cedula = MutableStateFlow("")
        private set
    var telefono = MutableStateFlow("")
        private set
    var password = MutableStateFlow("")
        private set
    var confirmPassword = MutableStateFlow("")
        private set

    fun nombre(value: String) {
        nombre.value = value
    }

    fun ciudad(value: String) {
        ciudad.value = value
    }

    fun cedula(value: String) {
        cedula.value = value
    }

    fun telefono(value: String) {
        telefono.value = value
    }

    fun onEmailChange(value: String) {
        email.value = value
    }
    fun onPasswordChange(value: String) {
        password.value = value
    }

    fun onConfirmPasswordChange(value: String) {
        confirmPassword.value = value
    }

    fun register(): Boolean {
        return email.value.isNotEmpty()
                && password.value.isNotEmpty()
                && password.value == confirmPassword.value
    }
}