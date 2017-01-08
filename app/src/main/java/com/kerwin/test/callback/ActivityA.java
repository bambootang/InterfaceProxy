package com.kerwin.test.callback;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;


/**
 * Created by kerwin on 2017/1/7.
 */
public class ActivityA extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);
    }

    public void onTestForInnerClass(View view) {
        Intent intent = new Intent(this, ActivityB.class);
        intent.putExtra("listener", InterfaceProxy.newProxy(Listener2.class, new Listener2() {
            @Override
            public void printText(String text) {
                Log.d("ActivityA", "printText inner class " + text);
            }
        }));
        startActivity(intent);
    }
//
//
//    public void onTestForInnerClass(View view) {
//        Intent intent = new Intent(this, ActivityB.class);
//        intent.putExtra("listener", ListenerProxyUtils.newProxy(new Listener() {
//            @Override
//            public void test(String text) {
//                Log.d("ActivityA", "test inner class " + text);
//            }
//        }));
//        startActivity(intent);
//    }
//
//
//    public void onTestForInnerClass(View view) {
//        Intent intent = new Intent(this, ActivityB.class);
//        intent.putExtra("listener", new Listener() {
//            @Override
//            public void test(String text) {
//                Log.d("ActivityA", "test inner class " + text);
//            }
//        });
//        startActivity(intent);
//    }

    public void onTestForStaticInnerClass(View view) {
        Intent intent = new Intent(this, ActivityB.class);
        intent.putExtra("listener", new Test());
        startActivity(intent);
    }

    public void onTest(View view) {
        Intent intent = new Intent(this, ActivityB.class);
        intent.putExtra("listener", new TestListener());
        startActivity(intent);
    }

    private static class Test implements Listener {
        public void test(String text) {
            Log.d("Test", "test inner static class " + text);
        }
    }
}
