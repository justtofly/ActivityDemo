package com.activitydemo.base;

import android.app.Activity;

import java.util.ArrayList;
import java.util.List;

/**
 * 创建者     yangyanfei
 * 创建时间   2017/8/28 0028 17:04
 * 作用	      用一个专门的集合类对所有的活动进行管理，此类作为活动管理器
 * <p/>
 * 版本       $$Rev$$
 * 更新者     $$Author$$
 * 更新时间   $$Date$$
 * 更新描述   ${TODO}
 */
public class ActivityCollector {
    public static List<Activity> activities = new ArrayList<>();

    public static void addActivity(Activity activity){
        activities.add(activity);
    }

    public static void removeActivity(Activity activity){
        activities.remove(activity);
    }

    public static void finishAll(){
        for (Activity activity:activities) {
            if(!activity.isFinishing()){
                activity.finish();
            }
        }
    }
}
