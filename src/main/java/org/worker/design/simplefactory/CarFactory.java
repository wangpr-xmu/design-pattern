package org.worker.design.simplefactory;

/**
 * 工厂类
 * 用于创建对象
 */
public class CarFactory {
    public ICar getCar(String name) {
        ICar car = null;
        switch (name) {
            case "Han":
                car = new BYDHanCar();
                break;
            case "Qin":
                car = new BYDQinCar();
                break;
            case "Tang":
                car = new BYDTangCar();
                break;
            default:
                throw new RuntimeException("No such car");
        }
        return car;
    }
}
