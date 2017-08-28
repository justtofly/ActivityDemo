package com.fi.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

//四、singleInstance单一实例模式，第一个页面
public class First_Model4_Activity extends Activity implements View.OnClickListener {
    private static final String TAG = First_Model4_Activity.class.getSimpleName();
    //声明控件
    private Button btn_singleInstance;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //打印当前返回栈的id
        Log.e(TAG, "First_Model4_Activity:Task id is"+getTaskId());

        setContentView(R.layout.activity_model4_first);

        initView();
        initListener();
    }

    private void initListener() {
        btn_singleInstance.setOnClickListener(this);
    }

    private void initView() {
        btn_singleInstance= (Button) findViewById(R.id.btn_singleinstance);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_singleinstance:
                startActivity(new Intent(this,Second_Model4_Activity.class));
                break;
        }
    }
}
