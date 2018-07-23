package me.study.andbar.utils;

import android.app.Activity;

/**
 * Created by jiantao on 2017/5/22.
 */

public class DisplayUtil {

    public static int getScreenWidth(Activity context){
        // 获取屏幕宽高（方法1）
        int screenWidth = context.getWindowManager().getDefaultDisplay().getWidth(); // 屏幕宽（像素，如：480px）
        return screenWidth;
    }

    public static int getScreenHeight(Activity context){
        int screenHeight = context.getWindowManager().getDefaultDisplay().getHeight(); // 屏幕高（像素，如：800p）
        return screenHeight;
    }
}
