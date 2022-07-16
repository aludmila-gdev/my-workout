package com.example.myworkout.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.myworkout.R
import com.example.myworkout.R.id.*
import com.example.myworkout.model.Exercise

class ExerciseAdapter(
    private val dataset: List<Exercise>,
    private val context: Context
) : RecyclerView.Adapter<ExerciseAdapter.ExerciseViewHolder>() {

    class ExerciseViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val exerciseImageView: ImageView = view.findViewById(ExerciseImageView)
        val exerciseNameTextView: TextView = view.findViewById(ExerciseNameTextView)
        val exerciseSeriesTextView: TextView = view.findViewById(ExerciseSeriesTextView)
        val exerciseRepetitionsTextView: TextView = view.findViewById(ExerciseRepetitionsTextView)
        val exerciseRestTextView: TextView = view.findViewById(ExerciseRestTextView)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ExerciseViewHolder {
        val adapterLayout = LayoutInflater.from(parent.context)
            .inflate(R.layout.excercise, parent, false)

        return ExerciseViewHolder(adapterLayout)
    }

    override fun getItemCount() = dataset.size

    override fun onBindViewHolder(holder: ExerciseViewHolder, position: Int) {
        val exercise = dataset[position]
        holder.exerciseImageView.setImageResource(exercise.exerciseImageResourceId)
        holder.exerciseNameTextView.text = context.getString(R.string.exercise_name, exercise.name)
        holder.exerciseSeriesTextView.text =
            context.getString(R.string.exercise_series, exercise.series)
        holder.exerciseRepetitionsTextView.text =
            context.getString(R.string.exercise_repetitions, exercise.repetitions)
        holder.exerciseRestTextView.text = context.getString(R.string.exercise_rest, exercise.rest)
    }

}