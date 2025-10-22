package com.example.progr3ss.screens

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.progr3ss.model.Habit
import com.example.progr3ss.model.HabitDatabase
import kotlinx.coroutines.launch
import androidx.compose.runtime.rememberCoroutineScope

@Composable
fun AddHabitScreen(navController: NavController) {
    val context = LocalContext.current
    val db = HabitDatabase.getDatabase(context)
    val dao = db.habitDao()
    val scope = rememberCoroutineScope()

    var name by remember { mutableStateOf("") }

    Column(modifier = Modifier.padding(16.dp)) {
        Text("Add Habit", style = MaterialTheme.typography.headlineSmall)
        OutlinedTextField(value = name, onValueChange = { name = it }, label = { Text("Habit Name") })
        Spacer(Modifier.height(16.dp))
        Button(onClick = {
            scope.launch {
                dao.insert(Habit(name = name))
                navController.navigate("home")
            }
        }) {
            Text("Save")
        }
    }
}