package com.activitydemo.activity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.activitydemo.base.BaseActivity;

//standard是活动默认的启动模式
//重点研究standard模式，因此不必在意这段代码有什么实际意义
public class First_Model3_Activity extends BaseActivity implements View.OnClickListener {
    private static final String TAG = First_Model3_Activity.class.getSimpleName();
    //声明控件
    private Button btn_singleTask;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //打印当前代码的实例
        Log.e(TAG, this.toString());

        setContentView(R.layout.activity_model3_first);

        initView();
        initListener();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.e(TAG,"First_Model3_Activity:onRestart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e(TAG,"First_Model3_Activity:onDestroy");
    }

    private void initListener() {
        btn_singleTask.setOnClickListener(this);
    }

    private void initView() {
        btn_singleTask= (Button) findViewById(R.id.btn_singletask);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_singletask:
                startActivity(new Intent(this,Second_Model3_Activity.class));
                break;
        }
    }
}
