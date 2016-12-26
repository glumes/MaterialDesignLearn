package com.glumes.materialdesignlearn;

import android.os.Bundle;
import android.support.design.widget.AppBarLayout;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;

import com.glumes.materialdesignlearn.adapter.RecyclerAdapter;
import com.glumes.materialdesignlearn.util.CommonUtil;


import butterknife.BindView;
import butterknife.ButterKnife;

public class CollapsingToolbarLayoutActivity extends AppCompatActivity {


    @BindView(R.id.toolbar)
    Toolbar mToolbar;
    @BindView(R.id.collapsingtoolbarlayout)
    CollapsingToolbarLayout mCollapsingtoolbarLayout;
    @BindView(R.id.appbarlayout)
    AppBarLayout mAppbarLayout;
    @BindView(R.id.recyclerview)
    RecyclerView mRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_collapsing_toolbar_layout);
        ButterKnife.bind(this);
        mToolbar.setTitle("Title");
        mToolbar.setSubtitle("SubTitle");
        mToolbar.setNavigationIcon(R.mipmap.ic_drawer_home);
//        mToolbar.setLogo(R.mipmap.ic_launcher);
        mToolbar.inflateMenu(R.menu.toolbar_menu);

        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        mRecyclerView.setLayoutManager(layoutManager);

        mRecyclerView.setAdapter(new RecyclerAdapter(this, CommonUtil.getData("Data -")));

    }





}
