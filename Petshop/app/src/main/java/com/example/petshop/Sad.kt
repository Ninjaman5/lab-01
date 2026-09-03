package com.example.petshop

class Sad(date: String) : Mood(date) {
    override fun moodreport(): String {
        return "Sad"
    }
}