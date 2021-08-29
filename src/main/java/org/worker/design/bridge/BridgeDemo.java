package org.worker.design.bridge;

/**
 * 桥接模式
 * 将抽象部分与它的实现部分分离，使它们都可以独立的变化
 * 通过组合的方式建立两个类之间的联系
 */
public class BridgeDemo {

    public static void main(String[] args) {
        IPen nor = new NormalPen();
        nor.write("hello");

        AbstractPen abstractPen = new RedPen(nor);

        abstractPen.write("hello");
    }
}
