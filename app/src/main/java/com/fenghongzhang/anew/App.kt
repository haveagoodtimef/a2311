package com.fenghongzhang.anew

import android.app.Application
import cn.jpush.android.api.JPushInterface
import dagger.hilt.android.HiltAndroidApp
import dagger.hilt.android.lifecycle.HiltViewModel

@HiltAndroidApp
class App : Application() {

    override fun onCreate() {
        super.onCreate()
        JPushInterface.setDebugMode(true);
        JPushInterface.init(this);
    }
}