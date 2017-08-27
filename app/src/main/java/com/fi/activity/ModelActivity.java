package com.fi.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ModelActivity extends Activity implements View.OnClickListener {

    //声明控件
    private Button btn_model1;
    private Button btn_model2;
    private Button btn_model3;
    private Button btn_model4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_model);
        initView();
        initListener();
    }

    //设置监听
    private void initListener() {
        btn_model1.setOnClickListener(this);
        btn_model2.setOnClickListener(this);
        btn_model3.setOnClickListener(this);
        btn_model4.setOnClickListener(this);
    }

    //初始化控件
    private void initView() {
        btn_model1 = (Button) findViewById(R.id.btn_model1);
        btn_model2 = (Button) findViewById(R.id.btn_model2);
        btn_model3 = (Button) findViewById(R.id.btn_model3);
        btn_model4 = (Button) findViewById(R.id.btn_model4);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_model1:
                startActivity(new Intent(this, First_Model1_Activity.class));
                break;
            case R.id.btn_model2:
                //startActivity(new Intent(this, ModelActivity.class));
                break;
            case R.id.btn_model3:
                //startActivity(new Intent(this, ModelActivity.class));
                break;
            case R.id.btn_model4:
                //startActivity(new Intent(this, ModelActivity.class));
                break;
            default:
                break;
        }

    }
}
