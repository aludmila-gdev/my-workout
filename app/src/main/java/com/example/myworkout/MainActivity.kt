package com.example.myworkout

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
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
        recyclerView.adapter = ExerciseAdapter(dataSet, this)

        recyclerView.setHasFixedSize(true)
    }
}