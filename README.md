# Progr3SS - Habit Planner & Tracker

A minimal Android habit tracking app built with Jetpack Compose and Room Database.

## 🧩 Project Summary

- **App name**: Progr3SS Habit Planner & Tracker
- **Purpose**: Basic habit tracker with login, registration, home, and add habit features
- **Platform**: Android (Kotlin + Jetpack Compose)
- **Backend**: None — uses local storage (Room Database + SharedPreferences)
- **IDE**: IntelliJ IDEA (with Android plugin) or Android Studio

## ✨ Features

- **Splash Screen**: Auto-navigates to login after 2 seconds
- **User Authentication**: Login and registration with SharedPreferences
- **Habit Tracking**: Add and view habits stored in Room Database
- **Profile**: View user email and logout functionality
- **Material3 Design**: Modern UI with Material Design 3

## 📂 Project Structure

```
Progr3SS/
├── app/
│   ├── src/
│   │   ├── main/
│   │   │   ├── AndroidManifest.xml
│   │   │   ├── java/com/example/progr3ss/
│   │   │   │   ├── MainActivity.kt
│   │   │   │   ├── screens/
│   │   │   │   │   ├── SplashScreen.kt
│   │   │   │   │   ├── LoginScreen.kt
│   │   │   │   │   ├── RegisterScreen.kt
│   │   │   │   │   ├── HomeScreen.kt
│   │   │   │   │   ├── AddHabitScreen.kt
│   │   │   │   │   └── ProfileScreen.kt
│   │   │   │   └── model/
│   │   │   │       ├── Habit.kt
│   │   │   │       ├── HabitDao.kt
│   │   │   │       └── HabitDatabase.kt
│   │   │   └── res/
│   │   │       ├── values/strings.xml
│   │   │       ├── values/themes.xml
│   │   │       └── drawable/ic_launcher_foreground.xml
│   ├── build.gradle.kts
├── build.gradle.kts
└── settings.gradle.kts
```

## 🔧 Technical Stack

- **Kotlin**: 1.9.0
- **Jetpack Compose**: BOM 2024.04.01
- **Material3**: Latest
- **Navigation Compose**: 2.7.7
- **Room Database**: 2.6.1
- **MinSDK**: 24 (Android 7.0+)
- **TargetSDK**: 34 (Android 14)

## 🚀 Getting Started

1. Clone the repository
2. Open in IntelliJ IDEA with Android plugin or Android Studio
3. Sync Gradle files
4. Run on an emulator or physical device (Android 7.0+)

## 📱 App Flow

1. **Splash Screen** → Shows app logo for 2 seconds
2. **Login Screen** → Enter credentials or navigate to register
3. **Register Screen** → Create new account
4. **Home Screen** → View saved habits
5. **Add Habit Screen** → Add new habits to track
6. **Profile Screen** → View user info and logout

## 💾 Data Persistence

- **User credentials**: Stored in SharedPreferences
- **Habits**: Stored in Room Database (SQLite)

## 📝 License

This is a minimal educational project for learning Android development.
