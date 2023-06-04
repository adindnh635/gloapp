package com.salugan.gloapp.ui.activities.store

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import com.salugan.gloapp.adapter.ProductAdapter
import com.salugan.gloapp.data.productData
import com.salugan.gloapp.databinding.ActivityStoreBinding

class StoreActivity : AppCompatActivity() {

    private lateinit var binding: ActivityStoreBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityStoreBinding.inflate(layoutInflater)
        setContentView(binding.root)

        showRecyclerView()
    }

    private fun showRecyclerView() {
        binding.rvProducts.layoutManager = GridLayoutManager(this, 2)
        val productAdapter = ProductAdapter(productData)
        binding.rvProducts.adapter = productAdapter
    }
}