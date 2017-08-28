package com.fi.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
//四、第二个页面,此活动设置为单一实例模式
public class Second_Model4_Activity extends Activity {
    //声明控件
    private Button btn_model4_second;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //打印当前返回栈的id
        Log.e("First_Model4_Activity", "Second_Model4_Activity（此页面指定为单一实例模式）：Task id is"+getTaskId());

        setContentView(R.layout.activity_model4_second);

        //实例化
        btn_model4_second= (Button) findViewById(R.id.btn_model4_second);

        //点击监听
        btn_model4_second.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Second_Model4_Activity.this, Third_Model4_Activity.class));
            }
        });
    }

}
