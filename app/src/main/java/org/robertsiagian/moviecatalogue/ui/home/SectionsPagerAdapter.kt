package org.robertsiagian.moviecatalogue.ui.home

import android.content.Context
import androidx.annotation.StringRes
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import org.robertsiagian.moviecatalogue.R
import org.robertsiagian.moviecatalogue.ui.movies.MoviesFragment

class SectionsPagerAdapter(private val mContext: Context, fm: FragmentManager): FragmentPagerAdapter(fm, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT) {

    companion object {
        @StringRes
        private val TAB_TITLES = intArrayOf(
                R.string.movies
        )
    }

    override fun getItem(position: Int): Fragment =
            when (position) {
                0 -> MoviesFragment()
                else -> Fragment()
            }

    override fun getCount(): Int {
        return TAB_TITLES.size
    }

    override fun getPageTitle(position: Int) : CharSequence? = mContext.resources.getString(
            TAB_TITLES[position]
    )
}
