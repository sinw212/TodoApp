package com.example.todoapp.todo.home

class TodoListManager {
    val todoList: ArrayList<TodoModel> = arrayListOf()
    var bookmarkList: ArrayList<TodoModel> = arrayListOf()

    fun addItem(todoModel: TodoModel) {
        todoList.add(todoModel)
    }

    fun updateItem(todoModel: TodoModel, position: Int) {
        todoList[position] = todoModel
    }

    fun removeItem(position: Int) {
        todoList.removeAt(position)
    }

    fun updateSwitch(todoModel: TodoModel, position: Int) {
        todoList[position] = todoModel.copy(isSwitch = (!todoModel.isSwitch))
        bookmarkList = ArrayList(this.todoList.filter { it.isSwitch })
    }
}