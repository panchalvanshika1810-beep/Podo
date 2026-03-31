package com.example.productivity.data.local.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "timeblocks")
data class TimeBlock(
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,

    val startTime: String,   // "09:00"
    val endTime: String,     // "10:00"

    val taskTitle: String    // simple for now (later we can link properly)
)