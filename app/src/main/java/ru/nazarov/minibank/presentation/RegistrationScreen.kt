package ru.nazarov.minibank.presentation

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextRange
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel

@Composable
fun RegistrationScreen(
    viewModel: RegistrationViewModel = hiltViewModel()
) {
    RegistrationContent()
}

@Composable
fun RegistrationContent() {
    Scaffold(
        modifier = Modifier.padding(16.dp)
    ) { contentPadding ->
        Column(
            modifier = Modifier
                .padding(contentPadding)
                .fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            var loginText by rememberSaveable { mutableStateOf("") }
            var passwordText by rememberSaveable { mutableStateOf("") }
            var againPasswordText by rememberSaveable { mutableStateOf("") }

            Text(
                text = "Регистрация",
                modifier = Modifier.padding(vertical = 8.dp)
            )

            OutlinedTextField(
                value = loginText,
                onValueChange = { loginText = it },
                label = {
                    Text("Введите логин")
                },
                modifier = Modifier.padding(vertical = 8.dp)
            )

            OutlinedTextField(
                value = passwordText,
                onValueChange = { passwordText = it },
                label = {
                    Text("Введите пароль")
                },
                modifier = Modifier.padding(vertical = 8.dp)
            )

            OutlinedTextField(
                value = againPasswordText,
                onValueChange = { againPasswordText = it },
                label = {
                    Text("Введите пароль еще раз")
                },
                modifier = Modifier.padding(vertical = 8.dp)
            )
        }
    }
}

@Preview
@Composable
private fun RegistrationPreview() {
    RegistrationContent()
}