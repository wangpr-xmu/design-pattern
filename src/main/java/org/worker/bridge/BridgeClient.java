package org.worker.bridge;

public class BridgeClient {
    public static void main(String[] args) {
        IPen nor = new NormalPen();
        nor.write("hello");

        AbstractPen abstractPen = new RedPen(nor);

        abstractPen.write("hello");
    }
}
