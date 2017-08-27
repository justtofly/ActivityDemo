package com.fi.activity;

import android.app.Activity;
import android.os.Bundle;
//对话框式的活动
public class DialogActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dialog);
    }
}
