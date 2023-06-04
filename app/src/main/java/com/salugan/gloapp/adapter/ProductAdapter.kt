package com.salugan.gloapp.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.salugan.gloapp.data.Product
import com.salugan.gloapp.databinding.ProductItemBinding

class ProductAdapter (private val listProduct: ArrayList<Product>) : RecyclerView.Adapter<ProductAdapter.ViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = ProductItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun getItemCount(): Int = listProduct.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val product: Product = listProduct[position]
        holder.bind(product)
    }

    class ViewHolder(val binding: ProductItemBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(product: Product) {
            binding.apply {
                productImgPoster.setImageResource(product.image)
                tvName.text = product.name
                tvPrice.text = product.price

                itemView.setOnClickListener {
                    Toast.makeText(itemView.context, "Coming soon!", Toast.LENGTH_SHORT).show()
                }
            }
        }
    }
}