package com.app.climatechangetoday.climatenow.Fragments;


import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.app.climatechangetoday.climatenow.Adapters.ViewPagerAdapter;
import com.app.climatechangetoday.climatenow.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class LatestFeedsFragment extends Fragment {


    private ViewPager viewPager;
    private DrawerLayout drawer;
    private TabLayout tabLayout;
    private String[] pageTitle = {"Fragment 1", "Fragment 2", "Fragment 3"};


    public LatestFeedsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_latest_feeds, container, false);

        //viewPager = (ViewPager)rootView.findViewById(R.id.view_pager);
        //Toolbar toolbar = (Toolbar) rootView.findViewById(R.id.toolbar);
        //drawer = (DrawerLayout) rootView.findViewById(R.id.drawer_layout);

//set viewpager adapter
        //ViewPagerAdapter pagerAdapter = new ViewPagerAdapter(getSupportFragmentManager());
        //viewPager.setAdapter(pagerAdapter);

        return rootView;
    }


}
