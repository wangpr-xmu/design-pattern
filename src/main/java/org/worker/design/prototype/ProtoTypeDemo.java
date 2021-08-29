package org.worker.design.prototype;

/**
 * 原型模式
 * 通过拷贝原型对象创建新的对象
 * @author peiru wang
 * @date 2021/8/28
 */
public class ProtoTypeDemo {
    public static void main(String[] args) {
        Car car = new Car();
        Object clone = car.clone();
        System.out.println(car);
        System.out.println(clone);
    }
}
