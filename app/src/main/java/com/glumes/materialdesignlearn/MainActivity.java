package com.glumes.materialdesignlearn;

import android.content.Intent;
import android.os.Bundle;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {


    @BindView(R.id.text_input)
    TextView mTextInput;
    @BindView(R.id.toolbar)
    TextView mToolbar;
    @BindView(R.id.activity_main)
    ConstraintLayout mActivityMain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

    }

    @OnClick({R.id.text_input, R.id.toolbar,R.id.tablayout})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.text_input:
                startActivity(new Intent(MainActivity.this,TextInputActivity.class));
                break;
            case R.id.toolbar:
                startActivity(new Intent(MainActivity.this,ToolbarActivity.class));
                break;
            case R.id.tablayout:
                startActivity(new Intent(MainActivity.this,TabLayoutActivity.class));
                break;
            default:
                break;
        }
    }
}
