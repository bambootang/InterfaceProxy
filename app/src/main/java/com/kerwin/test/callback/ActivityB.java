package com.kerwin.test.callback;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;

/**
 * Created by kerwin on 2017/1/7.
 */
public class ActivityB extends Activity {

//    private Listener listener;
    private Listener2 listener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b);
//        listener = (Listener) getIntent().getSerializableExtra("listener");
        listener = (Listener2) getIntent().getSerializableExtra("listener");
    }

    public void onTest(View view) {
//        listener.test(toString());
        listener.printText(toString());
    }

}
