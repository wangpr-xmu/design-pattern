package org.worker.singleton.lazy;

/**
 * 懒汉式静态内部类实现
 * 优点：写法优雅，利用java本身语法特性，性能高，避免内存浪费
 * 缺点：能够被反射破坏
 */
public class StaticInnerClassLazySingleton {
    private StaticInnerClassLazySingleton(){
        if(LazyHolder.instance != null) {
            throw new RuntimeException("不允许反射创建对象");
        }
    }

    public static StaticInnerClassLazySingleton getInstance() {
        return LazyHolder.instance;
    }
    private static class LazyHolder {
        private static final StaticInnerClassLazySingleton instance = new StaticInnerClassLazySingleton();
    }
}
