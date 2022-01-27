package com.ir.fragmentlifecycle

import android.content.Context
import android.graphics.Color
import android.os.Build
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.RequiresApi
import com.ir.fragmentlifecycle.Object.Object
import kotlinx.android.synthetic.main.fragment_home.*
import kotlinx.android.synthetic.main.fragment_home.view.*
import kotlin.math.log

class HomeFragment : Fragment() {
    private val TAG = "HomeFragment"
    lateinit var rootHome:View
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        rootHome = inflater.inflate(R.layout.fragment_home, container, false)
        rootHome.setBackgroundColor(Color.parseColor(Object.string))
        val secondFragment = SecondFragment()
        val fragmentManager = parentFragmentManager
        rootHome.btn_card_editColor.setOnClickListener {
            fragmentManager.beginTransaction().replace(R.id.container , secondFragment).commit()
        }
        Log.d(TAG, "onCreateView: ")
        return rootHome
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        Log.d(TAG, "onAttach: ")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d(TAG, "onCreate: ")
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        Log.d(TAG, "onActivityCreated: ")
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG, "onStart: ")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "onResume: ")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG, "onPause: ")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, "onStop: ")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.d(TAG, "onDestroyView: ")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "onDestroy: ")
    }

    override fun onDetach() {
        super.onDetach()
        Log.d(TAG, "onDetach: ")
    }
}