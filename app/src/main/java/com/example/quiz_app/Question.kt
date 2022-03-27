package com.example.quiz_app

import java.util.*

data class Question (
    val id: Int,
    val question: String,
    val image: Int,
    val optionOne: Int,
    val optionTwo: Int,
    val optionThree: Int,
    val optionFour: Int,
    val correctAnswer: Int
)
