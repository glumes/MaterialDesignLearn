package com.glumes.materialdesignlearn;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import com.glumes.materialdesignlearn.adapter.TabPagerAdapter;

import butterknife.BindView;
import butterknife.ButterKnife;

public class TabLayoutActivity extends AppCompatActivity {

    @BindView(R.id.tabLayout)
    TabLayout mTabLayout;
    @BindView(R.id.viewpager)
    ViewPager mViewpager;

    private TabPagerAdapter mTabPagerAdapter ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tab_layout);
        ButterKnife.bind(this);

        mTabPagerAdapter = new TabPagerAdapter(getSupportFragmentManager());

        mViewpager.setAdapter(mTabPagerAdapter);

        // 设置回调
        mViewpager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(mTabLayout));
        // 设置 Tab 模式
        mTabLayout.setTabMode(TabLayout.MODE_FIXED);

        mTabLayout.setupWithViewPager(mViewpager);

    }




}
