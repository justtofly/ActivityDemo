package com.fi.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

//singleTop单一栈顶模式
//当前活动处于栈顶，无论启动自身多少次，都只会有一个实例，仅按一次Back键就可以退出程序
//当前活动不处于栈顶，无论启动自身多少次，都只会有一个实例，仅按一次Back键就可以退出程序
public class First_Model2_Activity extends Activity implements View.OnClickListener {
    private static final String TAG = First_Model2_Activity.class.getSimpleName();
    //声明控件
    private Button btn_singletop1;
    private Button btn_singletop2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //打印当前代码的实例
        Log.e(TAG, this.toString());

        setContentView(R.layout.activity_model2_first);

        initView();
        initListener();
    }

    private void initListener() {
        btn_singletop1.setOnClickListener(this);
        btn_singletop2.setOnClickListener(this);
    }

    private void initView() {
        btn_singletop1= (Button) findViewById(R.id.btn_singletop1);
        btn_singletop2= (Button) findViewById(R.id.btn_singletop2);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_singletop1:
                startActivity(new Intent(this,First_Model2_Activity.class));
                break;
            case R.id.btn_singletop2:
                startActivity(new Intent(this,Second_Model2_Activity.class));
                break;
        }
    }
}
