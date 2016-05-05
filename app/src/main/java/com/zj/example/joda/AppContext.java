package com.zj.example.joda;

import android.app.Application;

import net.danlew.android.joda.JodaTimeAndroid;

/**
 * Created by zhengjiong on 16/5/5.
 */
public class AppContext extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        JodaTimeAndroid.init(this);
    }
}
