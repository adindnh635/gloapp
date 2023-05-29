package com.salugan.gloapp.ui.activities.result.skin_disease

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.salugan.gloapp.databinding.ActivityDiseaseBinding

class DiseaseActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDiseaseBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDiseaseBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}