package com.health.healthapp.fragments

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.health.healthapp.Adapter.gym_beginner_adapter
import com.health.healthapp.R
import com.health.healthapp.model.gym_routine


class Gym_routine_beginner : Fragment() {
    lateinit var recyclerView : RecyclerView
    lateinit var llGym : RecyclerView.LayoutManager
    lateinit var recyclerAdapter: gym_beginner_adapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_gym_routine, container, false)
        recyclerView = view.findViewById(R.id.recycler_gym)
        llGym = LinearLayoutManager(activity)
        val listofDays = arrayListOf<gym_routine>()

        listofDays.add(
            gym_routine("Day 1","Full Body","Workout")
        )
        listofDays.add(
            gym_routine("Day 2","Full Body","Workout")
        )

        listofDays.add(
            gym_routine("Day 3","Full Body","Workout")
        )


        recyclerAdapter = gym_beginner_adapter(activity as Context,listofDays)
        recyclerView.layoutManager = llGym
        recyclerView.adapter = recyclerAdapter

        return view
    }

}