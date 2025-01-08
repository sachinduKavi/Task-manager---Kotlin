package com.skcode2001.taskhub.sql_helper

class Task {
    val name: String
    val description: String
    val icon: Int
    val goal: String
    val color: Int

    constructor(name: String, description: String, icon: Int, color: Int, goal: String) {
        this.name = name
        this.description = description
        this.icon = icon
        this.goal = goal
        this.color = color
    }
}