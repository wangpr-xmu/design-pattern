package org.worker.design.abstractfactory;

public class AMDCpu implements Cpu {
    @Override
    public void compute() {
        System.out.println("AMD cpu compute");
    }
}
