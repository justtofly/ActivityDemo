package com.activitydemo.activity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.activitydemo.base.ActivityCollector;
import com.activitydemo.base.BaseActivity;

//四、第三个页面
public class Third_Model4_Activity extends BaseActivity {
    //声明控件
    private Button btn_out_app;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //打印当前返回栈的id
        Log.e("First_Model4_Activity", "Third_Model4_Activity:Task id is"+getTaskId());

        setContentView(R.layout.activity_model4_third);

        //实例化控件
        btn_out_app= (Button) findViewById(R.id.btn_out_app);
        btn_out_app.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ActivityCollector.finishAll();
            }
        });
    }

}
