package com.example.android.tourguide;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;;

public class SimpleFragmentPagerAdapter extends FragmentPagerAdapter {

    public SimpleFragmentPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new SightsFragment();
        } else if (position == 1) {
            return new ParksFragment();
        } else if (position == 2) {
            return new CafeFragment();
        } else {
            return new LakesFragment();
        }
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public String getPageTitle(int position) {
        String title = "";
        if (position == 0) {
            title = "Sights";
        } else if (position == 1) {
            title = "Parks";
        } else if (position == 2) {
            title = "Cafés";
        } else {
            title = "Lakes";
        }
        return title;
    }
}
