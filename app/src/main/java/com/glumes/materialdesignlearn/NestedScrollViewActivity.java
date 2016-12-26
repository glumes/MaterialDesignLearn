package com.glumes.materialdesignlearn;

import android.os.Bundle;
import android.support.design.widget.AppBarLayout;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.widget.NestedScrollView;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import butterknife.BindView;
import butterknife.ButterKnife;

public class NestedScrollViewActivity extends AppCompatActivity {

    @BindView(R.id.toolbar)
    Toolbar mToolbar;
    @BindView(R.id.collapsingtoolbarlayout)
    CollapsingToolbarLayout mCollapsingtoolbarLayout;
    @BindView(R.id.appbarlayout)
    AppBarLayout mAppbarLayout;
    @BindView(R.id.floatingActionButton)
    FloatingActionButton mFloatingActionButton;
    @BindView(R.id.nestedscrollview)
    NestedScrollView mNestedScrollView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nested_scroll_view);
        ButterKnife.bind(this);
        mToolbar.setTitle("Title");
        mToolbar.setSubtitle("SubTitle");
        mToolbar.setNavigationIcon(R.mipmap.ic_drawer_home);
//        mToolbar.setLogo(R.mipmap.ic_launcher);
        mToolbar.inflateMenu(R.menu.toolbar_menu);
    }
}
