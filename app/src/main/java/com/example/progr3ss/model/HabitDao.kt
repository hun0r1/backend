package com.example.progr3ss.model

import androidx.room.*

@Dao
interface HabitDao {
    @Query("SELECT * FROM habits")
    suspend fun getAll(): List<Habit>

    @Insert
    suspend fun insert(habit: Habit)

    @Delete
    suspend fun delete(habit: Habit)
}
