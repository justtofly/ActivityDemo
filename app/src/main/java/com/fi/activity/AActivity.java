package com.fi.activity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.fi.base.BaseActivity;
//数据从一个活动传递到另一个活动，在真正的项目中经常会有对接的问题出现，比如B页面不是你开发的，但你负责的部分需要有启动
//B页面的这个功能，而你却不清楚启动这个活动需要传递哪些数据。两个办法：1.阅读B中的代码，2.询问编写B的同事。会比较麻烦。
//这时候可以换一种写法。这样写的好处：B页面所需要的数据全部都在方法参数中体现出来了。
public class AActivity extends BaseActivity {
    //声明控件
    private Button btn_a;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a);

        //实例化
        btn_a= (Button) findViewById(R.id.btn_a);
        btn_a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BActivity.actionStart(AActivity.this,"data1","data2");
            }
        });
    }
}
