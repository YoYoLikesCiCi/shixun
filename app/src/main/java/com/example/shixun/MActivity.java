package com.example.shixun;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.RadioGroup;

public class MActivity extends AppCompatActivity {

    private RadioGroup rg_main;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_m);
//
        rg_main = findViewById(R.id.rg_main);
        rg_main.check(R.id.rb_home);
    }


}