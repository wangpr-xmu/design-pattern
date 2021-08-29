package org.worker.design.singleton.lazy;

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

    /**
     * 全局访问点
     * @return
     */
    public static StaticInnerClassLazySingleton getInstance() {
        return LazyHolder.instance;
    }

    /**
     * 静态内部类，加载时创建对象
     */
    private static class LazyHolder {
        private static final StaticInnerClassLazySingleton instance = new StaticInnerClassLazySingleton();
    }
}
