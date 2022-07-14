package com.example.myworkout.model

import androidx.annotation.DrawableRes

data class Exercise(
    @DrawableRes val exerciseImageResourceId: Int,
    val name: String,
    val series: String,
    val repetitions: String,
    val rest: String
)