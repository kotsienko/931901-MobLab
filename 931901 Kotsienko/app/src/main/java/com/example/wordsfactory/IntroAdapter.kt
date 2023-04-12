package com.example.wordsfactory

import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter

class IntroAdapter( activity: AppCompatActivity ): FragmentStateAdapter( activity ) {
    override fun getItemCount(): Int  = 3

    override fun createFragment( position: Int ): Fragment {
        return IntroFragment( position )
    }
}