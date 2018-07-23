package me.study.andbar.utils;

import android.app.Activity;
import android.content.Context;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;

import java.util.Timer;
import java.util.TimerTask;

/**
 * Created by jiantao on 2017/5/22.
 */

public class InputMethodUtil {


    public static void showInputMethod(final Activity activity, final EditText edittext){
        edittext.setFocusable(true);
        edittext.setFocusableInTouchMode(true);
        edittext.requestFocus();
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
                           public void run() {
                               InputMethodManager inputManager =
                                       (InputMethodManager) activity.getSystemService(Context.INPUT_METHOD_SERVICE);
                               inputManager.showSoftInput(edittext, 0);
                           }
                       },
                200);
    }
}
