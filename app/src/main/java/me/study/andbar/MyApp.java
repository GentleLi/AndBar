package me.study.andbar;

import android.app.Application;
import android.util.Log;

import me.study.andbar.utils.Utils;

/**
 * Created by admin on 2018/7/18.
 */

public class MyApp extends Application {

    private static final String TAG = MyApp.class.getSimpleName();

    @Override
    public void onCreate() {
        super.onCreate();
        Utils.init(getApplicationContext());
        Log.e(TAG, "onCreate");
    }


    @Override
    public void onLowMemory() {
        super.onLowMemory();
        Log.e(TAG, "onLowMemory");
    }


    @Override
    public void onTerminate() {
        super.onTerminate();
        Log.e(TAG, "onTerminate");
    }


}
