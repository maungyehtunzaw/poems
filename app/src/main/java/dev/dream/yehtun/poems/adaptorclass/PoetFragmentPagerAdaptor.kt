package dev.dream.yehtun.poems.adaptorclass

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter
import dev.dream.yehtun.poems.MemberListFragment
import dev.dream.yehtun.poems.PoetFragment
import dev.dream.yehtun.poems.PoetListFragment

/**
 * Created by Ye Htun on 1/16/2018.
 */

class PoetFragmentPagerAdaptor(fm: FragmentManager) : FragmentPagerAdapter(fm) {

    override fun getItem(position: Int): Fragment {
        var fragment: Fragment? = null
        when (position) {
            0 -> fragment = PoetListFragment()
            1 -> fragment = MemberListFragment()
            else -> fragment = PoetFragment()
        }
        return fragment
    }


    override fun getCount(): Int {
        return NUM_ITEMS
    }

    override fun getPageTitle(position: Int): CharSequence {
        return if (position == 0)
            "CLASSIC POETS"
        else
            "MEMBERS POETS"
    }

    companion object {
        private val NUM_ITEMS = 2
    }
}