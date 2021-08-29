package org.worker.design.simplefactory;

/**
 * 简单工厂模式
 * 由一个工厂对象决定创建哪一种产品的实例
 */
public class SimpleFactoryDemo {

    public static void main(String[] args) {

        CarFactory factory = new CarFactory();

        ICar benzMvpCar = factory.getCar("Tang");

        System.out.println(benzMvpCar.getClass().getSimpleName());

        ICar aLong = factory.getCar("Long");
    }
}
