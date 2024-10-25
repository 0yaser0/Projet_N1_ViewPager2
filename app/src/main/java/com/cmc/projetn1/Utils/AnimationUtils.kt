package com.munchbot.munchbot.Utils

import android.animation.Animator
import android.animation.AnimatorListenerAdapter
import android.animation.ObjectAnimator
import android.animation.AnimatorSet
import android.widget.ImageView

class AnimationUtils {
    companion object {
        fun startJumpingAnimation(
            imageView: ImageView,
            translationY: Float,
            duration: Long,
            startDelay: Long
        ) {
            val jumpUp = ObjectAnimator.ofFloat(imageView, "translationY", 0f, translationY)
            jumpUp.duration = duration

            val jumpDown = ObjectAnimator.ofFloat(imageView, "translationY", translationY, 0f)
            jumpDown.duration = duration

            val animatorSet = AnimatorSet()
            animatorSet.playSequentially(jumpUp, jumpDown)
            animatorSet.startDelay = startDelay
            animatorSet.start()

            animatorSet.addListener(object : AnimatorListenerAdapter() {
                override fun onAnimationEnd(animation: Animator) {
                    animatorSet.start()
                }
            })
        }
    }
}

