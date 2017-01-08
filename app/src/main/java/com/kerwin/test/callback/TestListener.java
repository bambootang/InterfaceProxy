package com.kerwin.test.callback;

import android.util.Log;

/**
 * Created by kerwin on 2017/1/7.
 */
public class TestListener implements Listener {

    @Override
    public void test(String text) {
        Log.d("TestListener", "test common class " + text);
    }
}

