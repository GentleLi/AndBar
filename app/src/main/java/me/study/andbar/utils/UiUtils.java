package me.study.andbar.utils;

import android.view.View;

/**
 * Created by jiantao on 2017/5/14.
 */

public class UiUtils {


    public static void setVisibility(View view,int visibility){
        if (null==view)return;
        view.setVisibility(visibility);
    }
}
