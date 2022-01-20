package com.example.youlu.login;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import com.example.youlu.R;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener {

    //控件
    private EditText etUsername;
    private EditText etPassword;
    private Button btnLogin;
    private ImageView ivQQ;
    private ImageView ivWeChat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if (getSupportActionBar() != null) {
            getSupportActionBar().hide();
        }//隐藏标题栏
        //绑定控件
        initView();
        //设置监听
        setView();
    }

    //绑定控件
    private void initView(){
        etUsername=findViewById(R.id.et_login_username);
        etPassword=findViewById(R.id.et_login_password);
        btnLogin=findViewById(R.id.btn_login_login);
        ivQQ=findViewById(R.id.iv_login_qq);
        ivWeChat=findViewById(R.id.iv_login_wechat);
    }

    //设置监听
    private void setView(){
        btnLogin.setOnClickListener(this);
        ivWeChat.setOnClickListener(this);
        ivQQ.setOnClickListener(this);
    }

    //点击判断
    @SuppressLint("NonConstantResourceId")
    @Override
    public void onClick(View v) {
switch (v.getId()){
    case R.id.btn_login_login:
        login();
        break;
    case R.id.iv_login_qq:
        qqLogin();
        break;
    case R.id.iv_login_wechat:
        weChatLogin();
        break;
}
    }

    //QQ登录
    private void qqLogin(){

    }

    //微信登陆
    private void weChatLogin(){

    }

    //普通登录
    private void login(){

    }
}