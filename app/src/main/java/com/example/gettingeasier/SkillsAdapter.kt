package com.example.gettingeasier

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.RatingBar
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_skill.view.*

class SkillsAdapter(private val context: Context, private val skillList: ArrayList<Skills>) :

    RecyclerView.Adapter<SkillsAdapter.MovieViewHolder>() {
    inner class MovieViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val skillImg: ImageView = itemView.skillImage_imageView
        val name: TextView = itemView.skillName_textView
        val lvl: RatingBar = itemView.skillRate_ratingBar
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val movieItemView = inflater.inflate(R.layout.item_skill, parent, false)

        return MovieViewHolder(movieItemView)
    }

    override fun onBindViewHolder(holder: MovieViewHolder, position: Int) {
        val skill: Skills = skillList[position]

        holder.skillImg.setImageResource(skill.image)
        holder.name.text = skill.name
        holder.lvl.rating = skill.lvl
    }

    override fun getItemCount(): Int {
        return skillList.size
    }

}

