package com.example.todoapp.presentation.bookmark

import android.os.Parcelable
import com.example.todoapp.presentation.todo.home.TodoModel
import kotlinx.parcelize.Parcelize

@Parcelize
data class BookmarkModel(
    val id: Long,
    val title: String?,
    val content: String?,
    val isSwitch: Boolean = false
) : Parcelable

fun BookmarkModel.toTodoModel(): TodoModel {
    return TodoModel(
        id = id,
        title = title,
        content = content,
        isSwitch = isSwitch
    )
}