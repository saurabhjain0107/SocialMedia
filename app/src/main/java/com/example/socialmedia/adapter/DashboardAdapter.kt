package com.example.socialmedia.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.socialmedia.Model.Dashboard
import com.example.socialmedia.R

class DashboardAdapter(val context: Context,val dashBoardList : ArrayList<Dashboard>) : RecyclerView.Adapter<DashboardAdapter.ViewHolder>() {
    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val profile = itemView.findViewById<ImageView>(R.id.profileImage)
        val postImg = itemView.findViewById<ImageView>(R.id.postImage)
        val saveImg = itemView.findViewById<ImageView>(R.id.save)
        val userName = itemView.findViewById<TextView>(R.id.userName)
        val about = itemView.findViewById<TextView>(R.id.about)
        val like = itemView.findViewById<TextView>(R.id.like)
        val comment = itemView.findViewById<TextView>(R.id.comment)
        val share = itemView.findViewById<TextView>(R.id.share)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
       val view: View = LayoutInflater.from(context).inflate(R.layout.dashboard_rv_sample,parent,false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val dashList = dashBoardList[position]
        holder.profile.setImageResource(dashList.profile)
        holder.postImg.setImageResource(dashList.postImg)
        holder.saveImg.setImageResource(dashList.save)
        holder.userName.text = dashList.name
        holder.about.text = dashList.about
        holder.like.text = dashList.like
        holder.comment.text = dashList.comment
        holder.share.text = dashList.share
    }

    override fun getItemCount(): Int {
        return dashBoardList.size
    }
}