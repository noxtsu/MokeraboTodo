package com.example.mokelabtodo

import androidx.lifecycle.ViewModel
import androidx.lifecycle.asLiveData
import com.example.mokelabtodo.repository.ToDoRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    repo: ToDoRepository
): ViewModel() {
    val todoList = repo.getAll().asLiveData()
}