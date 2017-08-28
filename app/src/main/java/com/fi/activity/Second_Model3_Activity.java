package com.fi.activity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.fi.base.BaseActivity;

public class Second_Model3_Activity extends BaseActivity {
    //声明控件
    private Button btn_model3_second;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //打印当前代码的实例
        Log.e("First_Model3_Activity", this.toString());

        setContentView(R.layout.activity_model3_second);

        //实例化
        btn_model3_second= (Button) findViewById(R.id.btn_model3_second);

        //点击监听
        btn_model3_second.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Second_Model3_Activity.this,First_Model3_Activity.class));
            }
        });
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e("First_Model3_Activity", "Second_Model3_Activity:onDestroy");
    }
}
