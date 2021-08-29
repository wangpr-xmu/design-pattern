package org.worker.design.abstractfactory;

public class AppleMainBoard implements MainBoard {
    @Override
    public void connect() {
        System.out.println("Apple main board compute");
    }
}
