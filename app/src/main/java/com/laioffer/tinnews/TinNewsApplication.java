package com.laioffer.tinnews;

import android.app.Application;

import com.facebook.stetho.Stetho;

public class TinNewsApplication extends Application {


    public void OnCreate() {
        super.onCreate();
        Stetho.initializeWithDefaults(this);
    }
}
