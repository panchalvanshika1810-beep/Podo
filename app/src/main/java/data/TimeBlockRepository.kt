package com.example.productivity.data

import com.example.productivity.data.local.dao.TimeBlockDao
import com.example.productivity.data.local.entity.TimeBlock

class TimeBlockRepository(private val dao: TimeBlockDao) {

    suspend fun insert(block: TimeBlock) {
        dao.insert(block)
    }

    suspend fun getAll(): List<TimeBlock> {
        return dao.getAll()
    }
}