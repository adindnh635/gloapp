package com.salugan.gloapp.data

import com.salugan.gloapp.R

data class Product(
    val name: String,
    val price: String,
    val image: Int,
)

val productData = arrayListOf(
    Product("Product 1", "50.000", R.drawable.p1),
    Product("Product 2", "120.000", R.drawable.p2),
    Product("Product 3", "300.000", R.drawable.p3),
    Product("Product 4", "50.000", R.drawable.p4),
    Product("Product 5", "20.000", R.drawable.p5),
    Product("Product 6", "300.000", R.drawable.p6),
    Product("Product 7", "250.000", R.drawable.p7),
    Product("Product 8", "50.000", R.drawable.p8)
)