package org.worker.singleton.lazy;

/**
 * 懒汉式单例模式
 * 优点：节省了内存，线程安全
 * 缺点：性能差
 */
public class SafeLazySingleton {
    private static SafeLazySingleton instance;

    private SafeLazySingleton(){}

    public synchronized static SafeLazySingleton getInstance() {
        if(null == instance) {
            instance = new SafeLazySingleton();
        }
        return instance;
    }

}
