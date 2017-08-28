package com.fi.activity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.fi.base.BaseActivity;

public class Second_Model2_Activity extends BaseActivity {
    //声明控件
    private Button btn_model2_second;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //打印当前代码的实例
        Log.e("First_Model2_Activity", this.toString());

        setContentView(R.layout.activity_model2_second);

        //实例化
        btn_model2_second= (Button) findViewById(R.id.btn_model2_second);

        //点击监听
        btn_model2_second.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Second_Model2_Activity.this,First_Model2_Activity.class));
            }
        });
    }
}
