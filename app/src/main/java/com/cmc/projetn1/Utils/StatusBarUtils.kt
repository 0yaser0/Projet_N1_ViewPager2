
package com.munchbot.munchbot.Utils

import android.os.Build
import android.view.Window
import android.view.View
import android.view.WindowInsetsController
import androidx.core.content.ContextCompat

object StatusBarUtils {
    fun setStatusBarColor(window: Window, colorResId: Int) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.R) {
            window.setDecorFitsSystemWindows(false)
            window.insetsController?.setSystemBarsAppearance(
                WindowInsetsController.APPEARANCE_LIGHT_STATUS_BARS,
                WindowInsetsController.APPEARANCE_LIGHT_STATUS_BARS
            )
        } else {
            @Suppress("DEPRECATION")
            window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR
        }
        window.statusBarColor = ContextCompat.getColor(window.context, colorResId)
    }
}
