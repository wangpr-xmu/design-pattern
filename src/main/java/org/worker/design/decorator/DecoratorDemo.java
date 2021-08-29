package org.worker.design.decorator;

/**
 * 装饰者模式
 * 在不改变原有类的基础上，将功能附加到对象上
 */
public class DecoratorDemo {
    public static void main(String[] args) {
        IPen pen = new NormalPen();
        ColorfulPenDecorator decorator = new ColorfulPenDecorator(pen, "红色");
        decorator.write("眼睛");
    }
}
