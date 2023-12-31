package com.example.todoapp.presentation.todo.add

enum class TodoContentType {
    ADD, EDIT, REMOVE;

    companion object {
        fun from(name: String?): TodoContentType? {
            return TodoContentType.values().find {
                it.name.uppercase() == name?.uppercase()
            }
        }
    }
}