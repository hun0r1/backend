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
fun ProfileScreen(navController: NavController) {
    val context = LocalContext.current
    val prefs = context.getSharedPreferences("user", Context.MODE_PRIVATE)
    val email = prefs.getString("email", "No user")

    Column(modifier = Modifier.padding(16.dp)) {
        Text("Profile", style = MaterialTheme.typography.headlineSmall)
        Spacer(Modifier.height(8.dp))
        Text("Email: $email")
        Spacer(Modifier.height(16.dp))
        Button(onClick = {
            prefs.edit().clear().apply()
            navController.navigate("login")
        }) {
            Text("Logout")
        }
    }
}