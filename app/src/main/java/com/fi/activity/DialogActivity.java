package com.fi.activity;

import android.os.Bundle;

import com.fi.base.BaseActivity;

//对话框式的活动
public class DialogActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dialog);
    }
}
