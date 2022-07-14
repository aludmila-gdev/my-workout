package com.example.myworkout.data

import com.example.myworkout.R
import com.example.myworkout.model.Exercise

object ExerciseDataSource {
    val exercises: List<Exercise> = listOf(
        Exercise(
            R.drawable.abdominal,
            "Abdominal",
            "3",
            "12",
            "60''"
        ),
        Exercise(
            R.drawable.agachamento_livre,
            "Agachamento Livre",
            "3",
            "12",
            "60''"
        ),
        Exercise(
            R.drawable.esteira,
            "Esteira",
            "1",
            "15 minutos",
            ""
        ),
        Exercise(
            R.drawable.panturrilha_unilateral,
            "Panturrilha Unilateral",
            "4",
            "10",
            "60''"
        )

    )
}