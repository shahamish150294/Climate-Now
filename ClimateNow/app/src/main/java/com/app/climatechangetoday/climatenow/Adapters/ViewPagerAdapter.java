package com.app.climatechangetoday.climatenow.Adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.app.climatechangetoday.climatenow.Fragments.Recent;
import com.app.climatechangetoday.climatenow.Fragments.ToDos;

/**
 * Created by shaha on 4/2/2017.
 */

public class ViewPagerAdapter extends FragmentPagerAdapter {

    public ViewPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        if (position ==0) {
            return new Recent();
        } else {
            return new ToDos();
        }
    }

    @Override
    public int getCount() {
        return 2;
    }
}