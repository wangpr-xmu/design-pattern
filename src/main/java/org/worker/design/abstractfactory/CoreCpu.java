package org.worker.design.abstractfactory;

public class CoreCpu implements Cpu {
    @Override
    public void compute() {
        System.out.println("Core Cpu compute");
    }
}
