package com.glumes.materialdesignlearn;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.Window;
import android.widget.Toast;

import com.glumes.materialdesignlearn.adapter.RecyclerAdapter;
import com.glumes.materialdesignlearn.util.CommonUtil;

import butterknife.BindView;
import butterknife.ButterKnife;

public class ToolbarActivity extends AppCompatActivity {


    @BindView(R.id.toolbar)
    Toolbar mToolbar;
    @BindView(R.id.recyclerview)
    RecyclerView mRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toolbar);

        ButterKnife.bind(this);
        mToolbar.setTitle("Title");
        mToolbar.setSubtitle("SubTitle");
        mToolbar.setNavigationIcon(R.mipmap.ic_drawer_home);
        mToolbar.inflateMenu(R.menu.toolbar_menu);
        mToolbar.setLogo(R.mipmap.ic_launcher);

        mToolbar.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.search:
                        Toast.makeText(ToolbarActivity.this, "Search", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.github:
                        Toast.makeText(ToolbarActivity.this, "Github", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.setting:
                        Toast.makeText(ToolbarActivity.this, "Setting", Toast.LENGTH_SHORT).show();
                        break;
                    default:
                        break;
                }
                return true;
            }
        });

        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        mRecyclerView.setLayoutManager(layoutManager);

        mRecyclerView.setAdapter(new RecyclerAdapter(this, CommonUtil.getData("Data -")));

    }
}
