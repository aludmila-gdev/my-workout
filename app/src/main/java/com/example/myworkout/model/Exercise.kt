package com.example.myworkout.model

import androidx.annotation.DrawableRes

data class Exercise(
    @DrawableRes val imageResourceId: Int,
    val name: String,
    val series: String,
    val repetitions: String,
    val rest: String
)