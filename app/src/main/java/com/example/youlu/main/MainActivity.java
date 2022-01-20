package com.example.youlu.main;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import com.example.youlu.R;

public class MainActivity extends AppCompatActivity {

    public static void startActivity(Context context){
        Intent intent = new Intent(context,MainActivity.class);
        context.startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}