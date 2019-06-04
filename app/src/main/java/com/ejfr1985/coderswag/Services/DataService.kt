package com.ejfr1985.coderswag.Services

import com.ejfr1985.coderswag.Model.Category
import com.ejfr1985.coderswag.Model.Product

object DataService {

    val categories = listOf(
        Category("SHIRTS", "shirtimage"),
        Category("HATS", "hatimage"),
        Category("HOODIES", "hoodieimage"),
        Category("DIGITAL", "digitalgoodsimage")
    )

    val hats = listOf(

        Product("Hat 1 special","$15","hat1"),
        Product("Hat 2 Normal","$18","hat2"),
        Product("Hat 3 DD","$21","hat3"),
        Product("hat 4 Extra","$20","hat4")

    )

    val hoodies = listOf(
        Product("Hoodie 1","$13","hoodie1"),
        Product("Hoodie 2 Special","$25","hoodie2"),
        Product("Hoodie 3 Normal","$20","hoodie3"),
        Product("Hoodie 4 Extra","$18","hoodie4")
    )

    val shirts = listOf(

        Product("Shirt 1 Normal","$9","shirt1"),
        Product("Shirt 2 Extra","$16","shirt2"),
        Product("Shirt 3 Extra","$18","shirt3"),
        Product("Shirt 4 Special","$21","shirt4"),
        Product("Shirt 5 Discount","$28","shirt5")

    )

}