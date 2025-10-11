package com.example.progr3ss.screens

import android.content.Context
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@Composable
fun RegisterScreen(navController: NavController) {
    val context = LocalContext.current
    var email by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }
    var confirm by remember { mutableStateOf("") }

    Column(modifier = Modifier.padding(16.dp)) {
        Text("Register", style = MaterialTheme.typography.headlineSmall)
        OutlinedTextField(value = email, onValueChange = { email = it }, label = { Text("Email") })
        OutlinedTextField(value = password, onValueChange = { password = it }, label = { Text("Password") })
        OutlinedTextField(value = confirm, onValueChange = { confirm = it }, label = { Text("Confirm Password") })
        Spacer(Modifier.height(16.dp))
        Button(onClick = {
            if (password == confirm) {
                val prefs = context.getSharedPreferences("user", Context.MODE_PRIVATE)
                prefs.edit().putString("email", email).putString("password", password).apply()
                navController.navigate("login")
            }
        }) { Text("Register") }
    }
}
