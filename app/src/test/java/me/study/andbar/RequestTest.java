package me.study.andbar;

import org.junit.Test;

/**
 * Created by admin on 2018/7/24.
 */

public class RequestTest {
    private static final String TAG = RequestTest.class.getSimpleName();

    @Test
    public void requestData() throws Exception {
        System.out.println("requestData");
    }

    @Test
    public void calculate() {
        System.out.println("calculate 3 + 4 = " + (3 + 4));
    }

}
