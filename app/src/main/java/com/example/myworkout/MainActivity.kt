package com.example.myworkout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import com.example.myworkout.adapter.ExerciseAdapter
import com.example.myworkout.data.ExerciseDataSource

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.hide()
        val dataSet = ExerciseDataSource.exercises

        val recyclerView = findViewById<RecyclerView>(R.id.exercise_list_recycler_view)
        recyclerView.adapter = ExerciseAdapter(dataSet)

        recyclerView.setHasFixedSize(true)
    }
}