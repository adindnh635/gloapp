package com.salugan.gloapp.ui.activities.webview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.salugan.gloapp.databinding.ActivityNewsWebViewBinding

class NewsWebView : AppCompatActivity() {

    private lateinit var binding: ActivityNewsWebViewBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityNewsWebViewBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val newsUrl = intent.getStringExtra(EXTRA_NEWS)
        val webView = binding.webview
        if (newsUrl != null) webView.loadUrl(newsUrl)
    }

    companion object {
        const val EXTRA_NEWS = "extra_news"
    }
}