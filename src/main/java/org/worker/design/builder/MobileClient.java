package org.worker.design.builder;

public class MobileClient {
    public static void main(String[] args) {
        MobilePhone phone = new MobileBuilder()
                .buildWith(new Kiri990Cpu())
                .buildWith(new Memory(16))
                .build();
        System.out.println(phone);
    }
}
