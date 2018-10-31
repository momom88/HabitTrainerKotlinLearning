package com.example.martinzamarski.habittrainer

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.single_card.view.*


class HabitsAdapter(val habbits: List<Habit>) : RecyclerView.Adapter<HabitsAdapter.HabitViewHolder>() {

    class HabitViewHolder(val card: View) : RecyclerView.ViewHolder(card)

    // Specifies the contents for the shown item/habit
    override fun onBindViewHolder(holder: HabitViewHolder, position: Int) {
            val habit = habbits[position]
            holder.card.tv_title.text = habit.title
            holder.card.tv_description.text = habit.description
            holder.card.iv_icon.setImageBitmap(habit.image)
    }

    // Create a new ViewHolder
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HabitViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.single_card, parent, false)
        return HabitViewHolder(view)
    }

    override fun getItemCount() = habbits.size


}