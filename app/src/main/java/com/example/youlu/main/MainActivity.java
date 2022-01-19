package com.example.youlu.main;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.youlu.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if (getSupportActionBar() != null) {
            getSupportActionBar().hide();
        }//隐藏标题栏
    }
}