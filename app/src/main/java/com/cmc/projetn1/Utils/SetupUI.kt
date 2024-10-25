package com.munchbot.munchbot.Utils

import android.annotation.SuppressLint
import android.app.Activity
import android.view.MotionEvent
import android.view.View
import android.view.ViewGroup
import com.google.android.material.textfield.TextInputEditText

object SetupUI {
    @SuppressLint("ClickableViewAccessibility")
    fun setupUI(view: View) {
        if (view !is TextInputEditText) {
            view.setOnTouchListener { _, event ->
                if (event.action == MotionEvent.ACTION_DOWN) {
                    (view.context as? Activity)?.currentFocus?.clearFocus()
                }
                false
            }
        }

        if (view is ViewGroup) {
            for (i in 0 until view.childCount) {
                val innerView = view.getChildAt(i)
                setupUI(innerView)
            }
        }
    }
}