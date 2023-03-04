package com.example.socialmedia.Fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.socialmedia.Model.Dashboard
import com.example.socialmedia.Model.Story
import com.example.socialmedia.R
import com.example.socialmedia.adapter.DashboardAdapter
import com.example.socialmedia.adapter.StoryAdapter
import com.example.socialmedia.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {
    private lateinit var binding: FragmentHomeBinding
    private lateinit var storyRv : RecyclerView
    private lateinit var dashRv : RecyclerView
    private lateinit var storyAd : StoryAdapter
    private lateinit var dashAd : DashboardAdapter
    private lateinit var storyList : ArrayList<Story>
    private lateinit var dashList : ArrayList<Dashboard>
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
       binding =  FragmentHomeBinding.inflate(layoutInflater)

        storyRv = binding.storyRv
        storyList = ArrayList()
        storyList.add(Story(R.drawable.srk,R.drawable.srk,"srk"))
        storyList.add(Story(R.drawable.road,R.drawable.srk,"srk"))
        storyList.add(Story(R.drawable.profile,R.drawable.srk,"srk"))
        storyList.add(Story(R.drawable.road,R.drawable.srk,"srk"))

        storyAd = StoryAdapter(requireContext(),storyList)
        val linearLayoutManager = LinearLayoutManager(requireContext(),LinearLayoutManager.HORIZONTAL,false)
        storyRv.layoutManager = linearLayoutManager
        storyRv.isNestedScrollingEnabled = false
        storyRv.adapter = storyAd

        dashList = ArrayList()
        dashRv = binding.postRv
        dashList.add(Dashboard(R.drawable.srk,R.drawable.road,R.drawable.ic_baseline_bookmark_border_24,"Saurabh","Android","100","50","12"))
        dashList.add(Dashboard(R.drawable.profile,R.drawable.srk,R.drawable.ic_baseline_bookmark_border_24,"SRK","Android","150","70","22"))

        dashAd = DashboardAdapter(requireContext(),dashList)
        val linearLayoutManager1 = LinearLayoutManager(requireContext())
        dashRv.layoutManager = linearLayoutManager1
        dashRv.adapter = dashAd

        return binding.root



    }
}