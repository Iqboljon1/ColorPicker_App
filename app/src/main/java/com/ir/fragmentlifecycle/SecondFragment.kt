package com.ir.fragmentlifecycle

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.ir.fragmentlifecycle.Object.Object
import kotlinx.android.synthetic.main.fragment_second.*
import kotlinx.android.synthetic.main.fragment_second.view.*

class SecondFragment : Fragment() {

    lateinit var rootSecond : View
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        rootSecond = inflater.inflate(R.layout.fragment_second, container, false)

        val homeFragment = HomeFragment()

        rootSecond.tv_0.setOnClickListener {
            exportColor("#000001")
        }

        rootSecond.tv_1.setOnClickListener {
            exportColor("#00BCD4")
        }

        rootSecond.tv_2.setOnClickListener {
            exportColor("#FFBB86FC")
        }

        rootSecond.tv_3.setOnClickListener {
            exportColor("#FF3700B3")
        }

        rootSecond.tv_4.setOnClickListener {
            exportColor("#FF6200EE")
        }

        rootSecond.tv_5.setOnClickListener {
            exportColor("#FF03DAC5")
        }

        rootSecond.tv_6.setOnClickListener {
            exportColor("#FF018786")
        }

        rootSecond.tv_7.setOnClickListener {
            exportColor("#FFFFFFFF")
        }

        rootSecond.tv_8.setOnClickListener {
            exportColor("#F44336")
        }

        rootSecond.tv_9.setOnClickListener {
            exportColor("#E91E63")
        }

        rootSecond.tv_10.setOnClickListener {
            exportColor("#9C27B0")
        }

        rootSecond.tv_11.setOnClickListener {
            exportColor("#2196F3")
        }

        rootSecond.tv_12.setOnClickListener {
            exportColor("#00BCD4")
        }

        rootSecond.tv_13.setOnClickListener {
            exportColor("#009688")
        }

        rootSecond.tv_14.setOnClickListener {
            exportColor("#AD98B1")
        }

        rootSecond.tv_15.setOnClickListener {
            exportColor("#666683")
        }

        rootSecond.tv_16.setOnClickListener {
            exportColor("#4CAF50")
        }

        rootSecond.tv_17.setOnClickListener {
            exportColor("#8BC34A")
        }

        rootSecond.tv_18.setOnClickListener {
            exportColor("#FFEB3B")
        }

        rootSecond.tv_19.setOnClickListener {
            exportColor("#FF5722")
        }

        rootSecond.btn_card_setColor.setOnClickListener {
            val fragmentManager = parentFragmentManager
            fragmentManager.beginTransaction().replace(R.id.container , homeFragment ).commit()
        }

        return rootSecond
    }
    fun exportColor(string: String) {
        Object.string = string
    }
}