package com.cmc.projetn1.main_view

import android.os.Bundle
import com.cmc.projetn1.ProjetN1Activity
import com.cmc.projetn1.databinding.GetStartedBinding
import com.cmc.projetn1.adapters.GetstartedAdapter

class GetStarted : ProjetN1Activity() {

    lateinit var binding: GetStartedBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = GetStartedBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val adapter = GetstartedAdapter(this)
        binding.viewPager.adapter = adapter
        binding.indicator.setViewPager(binding.viewPager)

    }
}
