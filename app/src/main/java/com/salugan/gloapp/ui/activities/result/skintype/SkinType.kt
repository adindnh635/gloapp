package com.salugan.gloapp.ui.activities.result.skintype

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.salugan.gloapp.databinding.ActivitySkinTypeBinding

class SkinType : AppCompatActivity() {

    private lateinit var binding: ActivitySkinTypeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySkinTypeBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}