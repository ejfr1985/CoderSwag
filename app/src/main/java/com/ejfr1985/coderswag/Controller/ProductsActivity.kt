package com.ejfr1985.coderswag.Controller

import android.content.res.Configuration
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.GridLayoutManager
import android.widget.Toast
import com.ejfr1985.coderswag.Adapters.ProductAdapter
import com.ejfr1985.coderswag.R
import com.ejfr1985.coderswag.Services.DataService
import com.ejfr1985.coderswag.Utilities.EXTRA_CATEGORY
import kotlinx.android.synthetic.main.activity_products.*

class ProductsActivity : AppCompatActivity() {
    lateinit var adapter: ProductAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_products)

        val categoryType = intent.getStringExtra(EXTRA_CATEGORY)
        adapter = ProductAdapter(this, DataService.getProducts(categoryType)){ item->
            Toast.makeText(this, item.title, Toast.LENGTH_SHORT).show()
        }

        productsListView.adapter = adapter
        var spanCount = 2

        val orientation = resources.configuration.orientation

        if (orientation == Configuration.ORIENTATION_LANDSCAPE){
            spanCount = 3
        }

        val screenSize = resources.configuration.screenWidthDp

        if (screenSize >= Configuration.SCREENLAYOUT_SIZE_LARGE){
            spanCount = 3
        }

        val layoutManager = GridLayoutManager(this, spanCount)
        productsListView.layoutManager = layoutManager

    }
}
