package com.android.byc.litepaltest;

import com.facebook.stetho.Stetho;

import org.litepal.LitePalApplication;

/**
 * @author yu
 * @version 1.0
 * @date 2019/1/21 9:37
 * @description
 */
public class MyApplication extends LitePalApplication {
    @Override
    public void onCreate() {
        super.onCreate();
        Stetho.initializeWithDefaults(this);
    }
}
