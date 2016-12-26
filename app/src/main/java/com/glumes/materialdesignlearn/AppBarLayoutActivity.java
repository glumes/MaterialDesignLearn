package com.glumes.materialdesignlearn;

import android.os.Bundle;
import android.support.design.widget.AppBarLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;

import com.glumes.materialdesignlearn.adapter.RecyclerAdapter;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

public class AppBarLayoutActivity extends AppCompatActivity {


    @BindView(R.id.toolbar)
    Toolbar mToolbar;
    @BindView(R.id.appbarlayout)
    AppBarLayout mAppbarlayout;
    @BindView(R.id.recyclerview)
    RecyclerView mRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_app_bar_layout);
        ButterKnife.bind(this);

        mToolbar.setTitle("Title");
        mToolbar.setSubtitle("SubTitle");
        mToolbar.setNavigationIcon(R.mipmap.ic_drawer_home);
        mToolbar.inflateMenu(R.menu.toolbar_menu);
        mToolbar.setLogo(R.mipmap.ic_launcher);

        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        mRecyclerView.setLayoutManager(layoutManager);

        mRecyclerView.setAdapter(new RecyclerAdapter(this,getData("Data -")));

    }



    private ArrayList<String> getData(String prefix){
        ArrayList<String> data = new ArrayList<>();

        for (int i = 0 ; i < 10 ; i ++){
            data.add(prefix + "  " + i);
        }

        return data ;
    }


}
