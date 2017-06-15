package com.example.android.tourguidestrings;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;


public class MyFragmentPagerAdapter extends FragmentPagerAdapter{

    /** String array holding the title for the fragment pages */
    private String tabTitles[] = new String[] {"Hotel", "Dinner", "Theatre", "Leisure"};

    /** Number of pages show in the ViewPager */
    private static final int NUMBER_OF_PAGES = 4;

    /** Constructor for MyFragmentPagerAdapter */
    public MyFragmentPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    /** Overide method getItem to load the Fragment */
    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new HotelFragment();
        } else if (position == 1) {
            return new DinnerFragment();
        } else if (position == 2) {
            return new TheatreFragment();
        } else {
            return new LeisureFragment();
        }
    }

    /** getCount method to is needed for the ViewPager */
    @Override
    public int getCount() {
        return NUMBER_OF_PAGES;
    }

    /** This method provides the ViewPager with the names for the tabs */
    @Override
    public CharSequence getPageTitle(int position) {
        return tabTitles[position];
    }
}
