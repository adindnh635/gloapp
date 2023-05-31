package com.salugan.gloapp.adapter

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.salugan.gloapp.data.News
import com.salugan.gloapp.databinding.NewsItemBinding
import com.salugan.gloapp.ui.activities.webview.NewsWebView

class NewsAdapter (private val listNews: ArrayList<News>) : RecyclerView.Adapter<NewsAdapter.ViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = NewsItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun getItemCount(): Int = listNews.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val news: News = listNews[position]
        holder.bind(news)
    }

    class ViewHolder(var binding: NewsItemBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(news: News) {
            binding.apply {
                Glide.with(itemView.context)
                    .load(news.urlToImage)
                    .into(imgPoster)
                tvItemTitle.text = news.title
                tvItemPublishedDate.text = news.publishedAt

                itemView.setOnClickListener {
                    Toast.makeText(itemView.context, "Opening article", Toast.LENGTH_SHORT).show()
                    val intent = Intent(itemView.context, NewsWebView::class.java)
                    intent.putExtra(NewsWebView.EXTRA_NEWS, news.url)
                    itemView.context.startActivity(intent)
                }
            }
        }
    }
}