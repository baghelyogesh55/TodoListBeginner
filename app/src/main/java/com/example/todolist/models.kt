package com.example.todolist

data class Todo(val task:String,val done:Boolean) {
    override fun toString(): String {
        return this.task
    }
}