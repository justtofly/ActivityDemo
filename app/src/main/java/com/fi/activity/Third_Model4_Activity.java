package com.fi.activity;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
//四、第三个页面
public class Third_Model4_Activity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //打印当前返回栈的id
        Log.e("First_Model4_Activity", "Third_Model4_Activity:Task id is"+getTaskId());

        setContentView(R.layout.activity_model4_third);
    }

}
