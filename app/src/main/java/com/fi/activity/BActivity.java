package com.fi.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import com.fi.base.BaseActivity;

public class BActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b);
    }
    public static void actionStart(Context context,String data1,String data2){
        Intent intent=new Intent(context,BActivity.class);
        intent.putExtra("param1",data1);
        intent.putExtra("param2",data2);
        context.startActivity(intent);
    }
}
