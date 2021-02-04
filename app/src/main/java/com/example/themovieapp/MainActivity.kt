package com.example.themovieapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.inputmethod.InputBinding
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.example.themovieapp.databinding.ActivityMainBinding
import com.example.themovieapp.ui.MovieFragment
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.view.*
import kotlinx.android.synthetic.main.activity_main.view.toolbar

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)
        if(savedInstanceState == null) {
            changeFragment(MovieFragment())
        }

    }

    fun changeFragment(f: Fragment, cleanStack: Boolean = false) {
        val ft = supportFragmentManager.beginTransaction()
        ft.replace(R.id.base_content, f)
        ft.addToBackStack(null)
        ft.commit()
    }

}