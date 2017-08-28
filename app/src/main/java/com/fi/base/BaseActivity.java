package com.fi.base;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

/**
 * 创建者     yangyanfei
 * 创建时间   2017/8/28 0028 16:48
 * 作用	      ${TODO}
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

        Log.e("BaseActivity","当前页面是："+getClass().getSimpleName());
    }
}
