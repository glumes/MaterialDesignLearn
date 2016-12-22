package com.glumes.materialdesignlearn;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;

public class TextInputActivity extends AppCompatActivity implements View.OnClickListener {

    private static final String TAG = TextInputActivity.class.getSimpleName();

    @BindView(R.id.login)
    Button mLogin;
    @BindView(R.id.password)
    EditText mPassword;
    @BindView(R.id.passwordLayout)
    TextInputLayout mPasswordLayout;
    @BindView(R.id.username)
    EditText mUsername;
    @BindView(R.id.usernameLayout)
    TextInputLayout mUsernameLayout;

    private static final String RIGHT_NAME = "name" ;
    private static final String RIGHT_PASSWORD = "password";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text_input);
        ButterKnife.bind(this);

        mUsernameLayout.setHint("please input your name");
        mPasswordLayout.setHint("please input your password");


        mLogin.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        hideKeyBoard();
        String username = mUsernameLayout.getEditText().getText().toString();
        String password = mPasswordLayout.getEditText().getText().toString();

        if (!username.equals(RIGHT_NAME)){
            mUsernameLayout.setError("not right username");
            Log.d(TAG,"not right username");
        }else if (!password.equals(RIGHT_PASSWORD)){
            mPasswordLayout.setError("not right password");
            Log.d(TAG,"not right password");
        }else {
            // 取消错误提醒
            mUsernameLayout.setErrorEnabled(false);
            mPasswordLayout.setErrorEnabled(false);
            Toast.makeText(TextInputActivity.this,"Welcome !",Toast.LENGTH_SHORT).show();
        }

    }

    /**
     * 隐藏输入法
     */
    private void hideKeyBoard(){
        View view = getCurrentFocus() ;
        if (view != null){
            ((InputMethodManager)getSystemService(Context.INPUT_METHOD_SERVICE))
                    .hideSoftInputFromWindow(view.getWindowToken(),InputMethodManager.HIDE_NOT_ALWAYS);
        }
    }
}
