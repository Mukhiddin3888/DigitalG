package com.example.myappgd.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.FragmentTransaction
import com.example.myappgd.R
import kotlinx.android.synthetic.main.fragment_today.*


class TodayFragment : Fragment() {

    lateinit var breakfastFragment: BreakfastFragment
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {


        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        breakfastFragment = BreakfastFragment()

        add_breakfastt.setOnClickListener() {
           val manager = fragmentManager?.beginTransaction()
               manager?.replace(R.id.frame_container, breakfastFragment)
                ?.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
                ?.commit()
        }


        return inflater.inflate(R.layout.fragment_today, container, false)
    }

}