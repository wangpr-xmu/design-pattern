package org.worker.design.singleton.lazy;

/**
 * 懒汉式双重校验
 * 优点：性能高，线程安全
 * 缺点：不够优雅
 */
public class DoubleCheckLazySingleton {
    /**
     * 私有的静态成员变量
     */
    private volatile static DoubleCheckLazySingleton instance;

    /**
     * 私有化构造器
     */
    private DoubleCheckLazySingleton(){}

    /**
     * 对象存在则直接返回，否则加锁创建
     * 创建对象时再次校验对象是否已创建
     * @return
     */
    public static DoubleCheckLazySingleton getInstance() {
        //对象已有直接返回
        if(instance == null) {
            //否则加锁创建对象
            synchronized (DoubleCheckLazySingleton.class) {
                //再次校验防止并发访问时
                // 第一个线程已经创建完成对象之后，第二个线程刚好进入临界区
                if(instance == null) {
                    instance = new DoubleCheckLazySingleton();
                }
            }
        }
        return instance;
    }
}
