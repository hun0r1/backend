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
fun LoginScreen(navController: NavController) {
    val context = LocalContext.current
    var email by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }

    Column(modifier = Modifier.padding(16.dp)) {
        Text("Login", style = MaterialTheme.typography.headlineSmall)
        OutlinedTextField(value = email, onValueChange = { email = it }, label = { Text("Email") })
        OutlinedTextField(value = password, onValueChange = { password = it }, label = { Text("Password") })
        Spacer(Modifier.height(16.dp))
        Button(onClick = {
            val prefs = context.getSharedPreferences("user", Context.MODE_PRIVATE)
            val savedEmail = prefs.getString("email", "")
            val savedPass = prefs.getString("password", "")
            if (email == savedEmail && password == savedPass) {
                navController.navigate("home")
            }
        }) {
            Text("Login")
        }
        TextButton(onClick = { navController.navigate("register") }) {
            Text("Register")
        }
    }
}