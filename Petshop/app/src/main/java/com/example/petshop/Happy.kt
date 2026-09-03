package com.example.petshop

class Happy(date: String) : Mood(date) {
    override fun moodreport(): String {
        return "Happy"
    }
}
