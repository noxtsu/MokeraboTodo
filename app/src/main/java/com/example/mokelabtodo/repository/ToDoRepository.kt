package com.example.mokelabtodo.repository

import com.example.mokelabtodo.model.todo.ToDo
import kotlinx.coroutines.flow.Flow

interface ToDoRepository {
    fun getAll(): Flow<List<ToDo>>
    suspend fun create(title: String, detail: String)
    suspend fun update(todo: ToDo, title: String, detail: String): ToDo
    suspend fun delete(todo: ToDo)
}