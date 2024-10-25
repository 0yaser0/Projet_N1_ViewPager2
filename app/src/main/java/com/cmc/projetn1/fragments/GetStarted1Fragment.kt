package com.cmc.projetn1.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import com.cmc.projetn1.ProjetN1Fragments
import com.cmc.projetn1.R
import com.munchbot.munchbot.Utils.AnimationUtils.Companion.startJumpingAnimation
import com.munchbot.munchbot.Utils.StatusBarUtils
import com.cmc.projetn1.databinding.GetStarted1Binding
import com.cmc.projetn1.main_view.GetStarted

class GetStarted1Fragment : ProjetN1Fragments() {
    private var _binding: GetStarted1Binding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = GetStarted1Binding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        StatusBarUtils.setStatusBarColor(requireActivity().window, R.color.secondColor)

        binding.next.setOnClickListener {
            (activity as? GetStarted)?.binding?.viewPager?.currentItem = 1
        }
    }


}
