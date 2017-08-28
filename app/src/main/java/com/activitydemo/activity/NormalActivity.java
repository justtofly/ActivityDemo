package com.activitydemo.activity;

import android.os.Bundle;

import com.activitydemo.base.BaseActivity;

public class NormalActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_normal);
    }
}
