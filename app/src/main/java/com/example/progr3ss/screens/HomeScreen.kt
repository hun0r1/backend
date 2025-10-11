package com.example.progr3ss.screens

import android.content.Context
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.progr3ss.model.Habit
import com.example.progr3ss.model.HabitDatabase
import kotlinx.coroutines.launch

@Composable
fun HomeScreen(navController: NavController) {
    val context = LocalContext.current
    val db = HabitDatabase.getDatabase(context)
    val dao = db.habitDao()
    val scope = rememberCoroutineScope()

    var habits by remember { mutableStateOf(listOf<Habit>()) }

    // Load habits from DB
    LaunchedEffect(Unit) {
        habits = dao.getAll()
    }

    Column(modifier = Modifier.padding(16.dp)) {
        Text("Today's Habits", style = MaterialTheme.typography.headlineSmall)
        Spacer(Modifier.height(8.dp))

        LazyColumn {
            items(habits.size) { i ->
                Text("- ${habits[i].name}", style = MaterialTheme.typography.bodyLarge)
            }
        }

        Spacer(Modifier.height(16.dp))
        Button(onClick = { navController.navigate("addHabit") }) {
            Text("Add Habit")
        }
        Spacer(Modifier.height(8.dp))
        TextButton(onClick = { navController.navigate("profile") }) {
            Text("Profile")
        }
    }
}
