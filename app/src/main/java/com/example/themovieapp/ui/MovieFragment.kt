package com.example.themovieapp.ui

import android.os.Build
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.themovieapp.R
import com.example.themovieapp.utils.inflate
import kotlinx.android.synthetic.main.frag_recycler.*

class MovieFragment : Fragment() {

    private val movieList by lazy { rv_movie_list }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return container?.inflate(R.layout.frag_recycler)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        movieList.setHasFixedSize(true)
        if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            movieList.layoutManager = LinearLayoutManager(context)
        }

    }
}