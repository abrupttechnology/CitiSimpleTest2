package com.example.simpletest2

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import org.com.testing.with.simpletest2.MainViewModel
import org.com.testing.with.simpletest2.MainViewModelListFactory
import org.com.testing.with.simpletest2.RVCustomAdapter

class MainActivity : AppCompatActivity() {

    val adapter = RVCustomAdapter()

    private val mainViewModel by viewModels<MainViewModel> {
        MainViewModelListFactory(this)
    }

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        val recyclerview = findViewById<RecyclerView>(R.id.mRecyclerView)
        recyclerview.adapter = adapter

        recyclerview.hasFixedSize()
        recyclerview.layoutManager = LinearLayoutManager(this)

        mainViewModel.articlesLiveData.observe(this) {
            adapter.setDataList(it as MutableList<Article>)
        }
    }
}
