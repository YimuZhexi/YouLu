package com.example.youlu.dialog;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.DialogFragment;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import com.example.youlu.R;

public class PhoneDialog extends DialogFragment implements View.OnClickListener {

    View view;

    private EditText etPhone;
    private EditText etCaptcha;
    private Button btnGetCaptcha;
    private Button btnYes;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    public static PhoneDialog newInstance() {
        Bundle args = new Bundle();
        PhoneDialog fragment = new PhoneDialog();
        fragment.setArguments(args);
        return fragment;
    }

    @SuppressLint("InflateParams")
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        // 加载 xml 布局
        view = inflater.inflate(R.layout.phone_dialog, null, false);
        view.setElevation(30);
        initView();
        setView();
        return view;
    }

    //初始化界面
    private void initView() {
        etPhone = view.findViewById(R.id.et_phone_in);
        etCaptcha = view.findViewById(R.id.et_phone_captcha);
        btnGetCaptcha = view.findViewById(R.id.btn_phone_getCaptcha);
        btnYes = view.findViewById(R.id.btn_phone_yes);
    }

    //设置监听
    private void setView() {
        btnGetCaptcha.setOnClickListener(this);
        btnYes.setOnClickListener(this);
    }

    //点击事件
    @SuppressLint("NonConstantResourceId")
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_phone_getCaptcha:
                getCaptcha();
                break;
            case R.id.btn_phone_yes:
                yes();
                break;
        }
    }

    //获取验证码
    private void getCaptcha() {
        String phoneNumber = etPhone.getText().toString();

    }

    //确认登陆
    private void yes() {
        String captcha = etCaptcha.getText().toString();

        dismiss();
    }
}