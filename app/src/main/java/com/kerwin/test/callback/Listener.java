package com.kerwin.test.callback;

import java.io.Serializable;

/**
 * Created by kerwin on 2017/1/7.
 */
public interface Listener extends Serializable {

    void test(String text);

}
