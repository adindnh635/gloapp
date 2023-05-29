package com.salugan.gloapp.ui.activities.result.undertone

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.salugan.gloapp.databinding.ActivityUndertoneBinding

class UndertoneActivity : AppCompatActivity() {

    private lateinit var binding: ActivityUndertoneBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityUndertoneBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}