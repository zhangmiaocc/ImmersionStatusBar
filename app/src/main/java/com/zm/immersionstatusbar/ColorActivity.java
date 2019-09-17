package com.zm.immersionstatusbar;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;


public class ColorActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_color);
        StatusBarUtils.setColor(this, getResources().getColor(R.color.colorPrimaryDark));
    }
}
