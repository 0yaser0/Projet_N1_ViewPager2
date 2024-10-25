package com.cmc.projetn1.fragments

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import com.cmc.projetn1.ProjetN1Fragments
import com.cmc.projetn1.R
import com.munchbot.munchbot.Utils.StatusBarUtils
import com.cmc.projetn1.databinding.GetStarted3Binding
import com.munchbot.munchbot.Utils.AnimationUtils.Companion.startJumpingAnimation

@Suppress("DEPRECATION")
class GetStarted3Fragment : ProjetN1Fragments() {
    private var _binding: GetStarted3Binding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View {
        _binding = GetStarted3Binding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        StatusBarUtils.setStatusBarColor(requireActivity().window, R.color.secondColor)

        jumpingAnimation(binding.jumpingImage)

    }

    private fun jumpingAnimation(imageView: ImageView) {
        startJumpingAnimation(imageView, -50f, 1000, 20)
    }
}
