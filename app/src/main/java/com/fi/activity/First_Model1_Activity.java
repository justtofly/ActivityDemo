package com.fi.activity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.fi.base.BaseActivity;

//standard是活动默认的启动模式
//重点研究standard模式，因此不必在意这段代码有什么实际意义
public class First_Model1_Activity extends BaseActivity implements View.OnClickListener {
    private static final String TAG =First_Model1_Activity.class.getSimpleName() ;
    //声明控件
    private Button btn_standard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //打印当前代码的实例
        Log.e(TAG, this.toString());

        setContentView(R.layout.activity_model1_first);

        initView();
        initListener();
    }

    private void initListener() {
        btn_standard.setOnClickListener(this);
    }

    private void initView() {
        btn_standard= (Button) findViewById(R.id.btn_standard);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_standard:
                startActivity(new Intent(this,First_Model1_Activity.class));
                break;
        }
    }
}
