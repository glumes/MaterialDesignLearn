package com.glumes.materialdesignlearn.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.glumes.materialdesignlearn.fragment.TabFragment;

import java.util.ArrayList;

/**
 * Created by zhaoying on 2016/12/22.
 */

public class TabPagerAdapter extends FragmentPagerAdapter {

    private ArrayList<Fragment> mFragments ;

    private String tabTitles[] = new String[]{"Tab1","Tab2","Tab3"} ;
    public TabPagerAdapter(FragmentManager fm) {
        super(fm);
        mFragments = new ArrayList<>();

        mFragments.add(TabFragment.newInstance("FragmentOne"));
        mFragments.add(TabFragment.newInstance("FragmentTwo"));
        mFragments.add(TabFragment.newInstance("FragmentThree"));

    }

    @Override
    public Fragment getItem(int position) {
        return mFragments.get(position);
    }

    @Override
    public int getCount() {
        return mFragments.size() ;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return tabTitles[position];
    }
}
