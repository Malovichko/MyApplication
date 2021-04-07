package com.example.myapplication

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import data.DataFactory
import list.ExampleAdapter


class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        init()
    }

    private fun init() {
        recyclerView = findViewById(R.id.recycler_view_item)
        recyclerView.layoutManager = GridLayoutManager(this, 2, GridLayoutManager.VERTICAL, false)
        val decorator = DividerItemDecoration(
            this,
            GridLayoutManager.VERTICAL
        )
        recyclerView.addItemDecoration(decorator)
        val adapter = ExampleAdapter()
        adapter.setUpStaffList(DataFactory.getStaffList())
        recyclerView.adapter = adapter
    }

}