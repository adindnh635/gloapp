package com.salugan.gloapp.ui.fragments.timeline

import android.content.pm.PackageManager
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.Toast
import androidx.activity.result.contract.ActivityResultContracts
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.salugan.gloapp.R
import com.salugan.gloapp.adapter.NewsAdapter
import com.salugan.gloapp.data.News
import com.salugan.gloapp.data.newsData
import com.salugan.gloapp.databinding.FragmentTimelineBinding

class TimelineFragment : Fragment() {

    private var _binding: FragmentTimelineBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        _binding = FragmentTimelineBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        showRecyclerList()
    }


    private fun showRecyclerList() {
        binding.rvNews.layoutManager = LinearLayoutManager(requireActivity())
        val newsAdapter = NewsAdapter(newsData)
        binding.rvNews.adapter = newsAdapter
    }
    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}