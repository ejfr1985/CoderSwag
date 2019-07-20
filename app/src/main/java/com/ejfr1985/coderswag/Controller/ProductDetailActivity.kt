package com.ejfr1985.coderswag.Controller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.ejfr1985.coderswag.Model.Product
import com.ejfr1985.coderswag.R
import com.ejfr1985.coderswag.Utilities.EXTRA_PRODUCT
import com.ejfr1985.coderswag.Utilities.TEXT_DESCRIPTION
import kotlinx.android.synthetic.main.activity_product_detail.*

class ProductDetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_product_detail)

        val productDetail = intent.getParcelableExtra<Product>(EXTRA_PRODUCT)

        productDetailName.text = productDetail.title
        productDetailDescription.text = TEXT_DESCRIPTION
        productDetailPrice.text = productDetail.price
        val resourceId =  this.resources.getIdentifier(productDetail.image, "drawable", this.packageName)
        productDetailImage.setImageResource(resourceId)
    }
}
