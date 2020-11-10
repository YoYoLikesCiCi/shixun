package com.example.shixun;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //延迟一秒，跳转到主页面
        new Handler().postDelayed(()->{
            startActivity(new Intent(MainActivity.this,MActivity.class));
            finish();
        },2000);
    }
}