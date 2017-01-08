package com.kerwin.test.callback;


import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.util.HashMap;

/**
 * Created by kerwin on 2016/1/7.
 */
public class ListenerProxyUtils implements Serializable {


    public static ListenerProxy newProxy(Listener listener) {
        ListenerProxy listenerProxy = new ListenerProxy(listener.toString());
        ProxyStore.callBack.put(listener.toString(), new WeakReference(listener));
        return listenerProxy;
    }

    private static class ListenerProxy implements Listener {

        String listener;

        public ListenerProxy(String listener) {
            this.listener = listener;
        }

        public void test(String text) {
            ProxyStore.callBack.get(listener).get().test(text);
        }
    }

    private static class ProxyStore {
        private static HashMap<String, WeakReference<Listener>> callBack = new HashMap<>();
    }
}
