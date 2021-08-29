package org.worker.design.singleton.lazy;

/**
 * 懒汉式单例模式
 * 优点：节省了内存，线程安全
 * 缺点：性能差
 */
public class SafeLazySingleton {
    /**
     * 声明一个静态常量
     */
    private static SafeLazySingleton instance;

    /**
     * 私有化构造器
     */
    private SafeLazySingleton(){}

    /**
     * 获取对象时加锁
     * 对象为空则创建，否则直接返回
     * @return
     */
    public synchronized static SafeLazySingleton getInstance() {
        if(null == instance) {
            instance = new SafeLazySingleton();
        }
        return instance;
    }

}
