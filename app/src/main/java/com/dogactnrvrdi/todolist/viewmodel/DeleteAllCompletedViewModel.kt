package com.dogactnrvrdi.todolist.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.dogactnrvrdi.todolist.data.Task
import com.dogactnrvrdi.todolist.data.TaskDao
import com.dogactnrvrdi.todolist.dependencyinjection.ApplicationScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class DeleteAllCompletedViewModel @Inject constructor(
    private val taskDao: TaskDao,
    @ApplicationScope private val applicationScope: CoroutineScope
) : ViewModel() {

    fun onConfirmClicked() = applicationScope.launch {
        taskDao.deleteCompletedTasks()
    }
}