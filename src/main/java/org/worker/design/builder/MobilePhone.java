package org.worker.design.builder;

public class MobilePhone {
    private MicroCpu microCpu;
    private Memory memory;

    public MicroCpu getMicroCpu() {
        return microCpu;
    }

    public void setMicroCpu(MicroCpu microCpu) {
        this.microCpu = microCpu;
    }

    public Memory getMemory() {
        return memory;
    }

    public void setMemory(Memory memory) {
        this.memory = memory;
    }
}
