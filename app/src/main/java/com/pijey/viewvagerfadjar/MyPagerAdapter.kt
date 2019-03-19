package com.pijey.viewvagerfadjar

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter
import com.pijey.viewvagerfadjar.FirstFragment
import com.pijey.viewvagerfadjar.FourthFragment
import com.pijey.viewvagerfadjar.SecondFragment
import com.pijey.viewvagerfadjar.ThirdFragment

class MyPagerAdapter(fm: FragmentManager): FragmentPagerAdapter(fm) {
    // sebuah list yang menampung objek Fragment
    private val pages = listOf(
            FirstFragment(), SecondFragment(), ThirdFragment(), FourthFragment()
    )
    // menentukan fragment yang akan dibuka pada posisi tertentu
    override fun getItem(position: Int): Fragment {
        return pages[position]
    }
    override fun getCount(): Int {
        return pages.size
    }
    // judul untuk tabs
    override fun getPageTitle(position: Int): CharSequence? {
        return when(position){
            0 -> "Profil"
            1 -> "Aksi"
            2 -> "Bunga"
            else -> "Hewan"
        }
    }
}
