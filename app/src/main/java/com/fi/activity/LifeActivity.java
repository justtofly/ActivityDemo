package com.fi.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
//1.Activity生命周期的演示
//2.活动被回收了怎么办
public class LifeActivity extends Activity implements View.OnClickListener {

    private static final String TAG =LifeActivity.class.getSimpleName() ;
    //声明控件
    private Button btn_life1;
    private Button btn_life2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Log.e(TAG, "onCreate excute");
        setContentView(R.layout.activity_life);

        //如果活动被回收了，就把之前保存的数据取出来
        if(savedInstanceState!=null){
            String tempData=savedInstanceState.getString("data_key");
            Log.e(TAG,"取出之前的数据："+tempData);
        }

        initView();
        initListener();
    }

    //临时数据的保存
    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        String tempData="Something you just typed";
        outState.putString("data_key",tempData);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e(TAG, "onStart excute");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e(TAG, "onResume excute");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e(TAG, "onPause excute");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e(TAG, "onStop excute");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e(TAG, "onDestroy excute");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.e(TAG, "onRestart excute");
    }

    //设置监听
    private void initListener() {
        btn_life1.setOnClickListener(this);
        btn_life2.setOnClickListener(this);
    }

    //初始化控件
    private void initView() {
        btn_life1 = (Button) findViewById(R.id.btn_life1);
        btn_life2 = (Button) findViewById(R.id.btn_life2);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_life1:
                startActivity(new Intent(this, NormalActivity.class));
                break;
            case R.id.btn_life2:
                startActivity(new Intent(this, DialogActivity.class));
                break;
            default:
                break;
        }

    }
}
