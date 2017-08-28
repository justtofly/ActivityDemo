package com.fi.base;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

/**
 * 创建者     yangyanfei
 * 创建时间   2017/8/28 0028 16:48
 * 作用	      活动的最佳实践：创建一个基类，其他所有的活动继承这个继承，但是它们仍然完全继承了Activity中的所有特性
 * <p/>
 * 版本       $$Rev$$
 * 更新者     $$Author$$
 * 更新时间   $$Date$$
 * 更新描述   ${TODO}
 */
public class BaseActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Log.e("BaseActivity", "当前页面是：" + getClass().getSimpleName());

        ActivityCollector.addActivity(this);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        //表示将一个马上要销毁的活动从活动管理器里移除
        ActivityCollector.removeActivity(this);
    }
}
