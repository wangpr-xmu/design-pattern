package org.worker.design.builder;

public class MobileBuilder {
    private MobilePhone mobilePhone;

    public MobileBuilder() {
        this.mobilePhone = new MobilePhone();
    }

    MobileBuilder buildWith(MicroCpu cpu) {
        this.mobilePhone.setMicroCpu(cpu);
        return this;
    }

    MobileBuilder buildWith(Memory memory) {
        this.mobilePhone.setMemory(memory);
        return this;
    }

    MobilePhone build() {
        return mobilePhone;
    }
}
