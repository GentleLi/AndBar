package me.study.andbar.config;

import android.os.Environment;

import java.io.File;

/**
 * Created by Jiantao on 2017/7/21.
 */

public class Storage {

    public static final String ROOT_DIR = Environment.getExternalStorageDirectory().getAbsolutePath() + File.separator + "GSMAlarm" + File.separator;
    public static final String FILE_DIR = ROOT_DIR + "file" + File.separator;
    public static final String CACHE_DIR = ROOT_DIR + "cache" + File.separator;

}
