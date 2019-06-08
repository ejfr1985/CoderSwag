package com.ejfr1985.coderswag.Controller

import android.content.AbstractThreadedSyncAdapter
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import com.ejfr1985.coderswag.Model.Category
import com.ejfr1985.coderswag.R
import com.ejfr1985.coderswag.Services.DataService
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var adapter: ArrayAdapter<Category>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        adapter = ArrayAdapter(
            this,
            android.R.layout.simple_list_item_1,
            DataService.categories
        )

        categoryListView.adapter = adapter


    }
}
