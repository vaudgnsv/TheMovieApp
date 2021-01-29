package com.example.themovieapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.inputmethod.InputBinding
import android.widget.TextView
import com.example.themovieapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding:ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        printHello()
    }
    fun printHello() {


        binding = ActivityMainBinding.inflate(layoutInflater)

        binding.txtHelloworld.setText("start kotlin")


    }
}