package com.example.socialmedia.adapter

import android.annotation.SuppressLint
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.socialmedia.Model.Story
import com.example.socialmedia.R

class StoryAdapter(val context: Context, val storyList : ArrayList<Story>) :RecyclerView.Adapter<StoryAdapter.ViewHolder>() {
    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        val storyImg = itemView.findViewById<ImageView>(R.id.postImage)
        val storyProfile = itemView.findViewById<ImageView>(R.id.profileImage)
        val name = itemView.findViewById<TextView>(R.id.stname)

    }

    @SuppressLint("SuspiciousIndentation")
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
      val view : View = LayoutInflater.from(context).inflate(R.layout.story_rv_design,parent,false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val storylist = storyList[position]
        holder.name.text = storylist.name
        holder.storyImg.setImageResource(storylist.story)
        holder.storyProfile.setImageResource(storylist.profile)
    }

    override fun getItemCount(): Int {
        return storyList.size
    }
}