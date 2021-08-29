package org.worker.design.singleton.hungry;

import java.io.Serializable;

/**
 * 饿汉式单例模式
 * 优点：执行效率高，性能高，没有任何锁
 * 缺点：某些情况下可能会造成内存浪费
 *
 */
public class HungrySingleton implements Serializable {
    /**
     * 静态常量，类加载的时候创建对象
     */
    private final static HungrySingleton instance = new HungrySingleton();

    /**
     * 私有化构造器
     */
    private HungrySingleton() {}

    /**
     * 提供一个全局访问点
     * @return
     */
    public static HungrySingleton getInstance() {
        return instance;
    }

    private Object readResolve() {
        return instance;
    }
}
