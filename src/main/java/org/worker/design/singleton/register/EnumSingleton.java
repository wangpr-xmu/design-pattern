package org.worker.design.singleton.register;

/**
 * effective java推荐使用的方式
 * 枚举式单例模式
 * 优点：写法优雅，线程安全，性能高
 * 缺点：内存浪费
 */
public enum  EnumSingleton {
    INSTANCE;

    private Object data;

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public static EnumSingleton getInstance() {
        return INSTANCE;
    }
}
