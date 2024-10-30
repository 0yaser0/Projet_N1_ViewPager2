package com.cmc.projetn1.main_view

import android.os.Bundle
import com.cmc.projetn1.ProjetN1Activity
import com.cmc.projetn1.R
import com.cmc.projetn1.databinding.GetStartedBinding
import com.cmc.projetn1.adapters.GetstartedAdapter
import com.google.android.material.tabs.TabLayoutMediator

class GetStarted : ProjetN1Activity() {
    lateinit var binding: GetStartedBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = GetStartedBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val adapter = GetstartedAdapter(this)
        binding.viewPager.adapter = adapter

        TabLayoutMediator(binding.tabLayout, binding.viewPager)
        { tab, position ->
            tab.text = when (position) {
                0 -> "Présentation"
                1 -> "Liste"
                2 -> "Image"
                else -> null
            }

        }.attach()

    }
}

