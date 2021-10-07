package com.example.fragmentexercise

import android.app.Activity
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment

class FourthFragment: Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        Log.i("FRAGMENT4_LIFECYCLE", "onCreateView")

        return inflater.inflate(R.layout.fragment_fourth, container, false)
    }

    override fun onAttach(activity: Activity) {
        super.onAttach(activity)

        Log.i("FRAGMENT4_LIFECYCLE", "onAttach")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        Log.i("FRAGMENT4_LIFECYCLE", "onCreate")
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        Log.i("FRAGMENT4_LIFECYCLE", "onActivityCreated")

        val addFirstFragmentButton = requireView().findViewById<Button>(R.id.addFirstFragmentBtn)
        addFirstFragmentButton.setOnClickListener {

            // create a FragmentManager
            val fragmentManager = fragmentManager

            // create a FragmentTransaction to begin the transaction and add the Fragment
            val fragmentTransaction = fragmentManager!!.beginTransaction()

            // add the Fragment to existing container
      
            fragmentTransaction.commit()

        }

        val addSecondFragmentButton = requireView().findViewById<Button>(R.id.addSecondFragmentBtn)
        addSecondFragmentButton.setOnClickListener {

            // create a FragmentManager
            val fragmentManager = fragmentManager

            // create a FragmentTransaction to begin the transaction and add the Fragment
            val fragmentTransaction = fragmentManager!!.beginTransaction()

            // add the Fragment to existing container
            fragmentTransaction.add(R.id.frameLayout, SecondFragment(), "SECOND_FRAGMENT")
            fragmentTransaction.commit()

        }

        val addThirdFragmentButton = requireView().findViewById<Button>(R.id.addThirdFragmentBtn)
        addThirdFragmentButton.setOnClickListener {

            // create a FragmentManager
            val fragmentManager = fragmentManager

            // create a FragmentTransaction to begin the transaction and add the Fragment
            val fragmentTransaction = fragmentManager!!.beginTransaction()

            // add the Fragment to existing container
            fragmentTransaction.add(R.id.frameLayout, ThirdFragment(), "THIRD_FRAGMENT")
            fragmentTransaction.commit()

        }
    }
}