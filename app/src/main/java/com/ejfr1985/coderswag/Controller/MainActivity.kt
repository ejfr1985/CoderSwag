package com.ejfr1985.coderswag.Controller

import android.content.AbstractThreadedSyncAdapter
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.widget.ArrayAdapter
import com.ejfr1985.coderswag.Adapters.CategoryAdapter
import com.ejfr1985.coderswag.Adapters.CategoryRecyclerAdapter
import com.ejfr1985.coderswag.Model.Category
import com.ejfr1985.coderswag.R
import com.ejfr1985.coderswag.Services.DataService
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var adapter: CategoryRecyclerAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        adapter = CategoryRecyclerAdapter(this, DataService.categories)

        categoryListView.adapter = adapter

        val layoutManager =  LinearLayoutManager(this)
        categoryListView.layoutManager = layoutManager
        categoryListView.setHasFixedSize(true)

    }
}
