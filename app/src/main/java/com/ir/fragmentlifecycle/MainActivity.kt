package com.ir.fragmentlifecycle

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val homeFragment = HomeFragment()
        val fragmentManager = supportFragmentManager
        fragmentManager.beginTransaction().replace(R.id.container, homeFragment).commit()
    }
}