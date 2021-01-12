package com.bharti.googlesigninsignupui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        println("onCreate Called")
    }
    override fun onStart() {
        super.onStart()
        println("onStart Called")
    }

    override fun onResume() {
        super.onResume()
        println("onResume Called")
    }

    override fun onPause() {
        super.onPause()
        println("onPause Called")
    }

    override fun onStop() {
        super.onStop()
        println("onStop Called")
    }

    override fun onDestroy() {
        super.onDestroy()
        println("onDestroy Called")
    }

    override fun onRestart() {
        super.onRestart()
        println("onRestart Called")
    }
}