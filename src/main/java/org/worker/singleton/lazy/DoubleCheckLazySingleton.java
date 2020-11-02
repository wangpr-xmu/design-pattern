package org.worker.singleton.lazy;

/**
 * 懒汉式双重校验
 * 优点：性能高，线程安全
 * 缺点：不够优雅
 */
public class DoubleCheckLazySingleton {
    private static DoubleCheckLazySingleton instance;

    private DoubleCheckLazySingleton(){}

    public static DoubleCheckLazySingleton getInstance() {
        if(instance == null) {
            synchronized (DoubleCheckLazySingleton.class) {
                if(instance == null) {
                    instance = new DoubleCheckLazySingleton();
                }
            }
        }
        return instance;
    }
}
