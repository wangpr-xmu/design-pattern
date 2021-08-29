package org.worker.design.singleton.seriable;

import java.io.Serializable;

/**
 * 饿汉式单例模式
 * 优点：执行效率高，性能高，没有任何锁
 * 缺点：某些情况下可能会造成内存浪费
 *
 */
public class HungrySingleton implements Serializable {
    private final static HungrySingleton instance = new HungrySingleton();
    private HungrySingleton() {}

    public static HungrySingleton getInstance() {
        return instance;
    }

    private Object readResolve() {
        return instance;
    }
}
