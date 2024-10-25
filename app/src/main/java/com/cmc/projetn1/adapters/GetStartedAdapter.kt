package com.cmc.projetn1.adapters

import GetStarted2Fragment
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.cmc.projetn1.fragments.GetStarted1Fragment
import com.cmc.projetn1.fragments.GetStarted3Fragment

class GetstartedAdapter(fragmentActivity: FragmentActivity)
    : FragmentStateAdapter(fragmentActivity) {

    override fun getItemCount(): Int {
        return 3
    }

    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> GetStarted1Fragment()
            1 -> GetStarted2Fragment()
            2 -> GetStarted3Fragment()
            else -> throw RuntimeException("Invalid position")
        }
    }
}
