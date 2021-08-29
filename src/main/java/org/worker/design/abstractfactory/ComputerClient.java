package org.worker.design.abstractfactory;

public class ComputerClient {
    public static void main(String[] args) {
        AppleComputeFactory appleComputeFactory = new AppleComputeFactory();
        appleComputeFactory.createCpu();
        appleComputeFactory.createMainBoard();
    }
}
