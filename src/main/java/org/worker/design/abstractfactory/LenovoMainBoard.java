package org.worker.design.abstractfactory;

public class LenovoMainBoard implements MainBoard {
    @Override
    public void connect() {
        System.out.println("Lenovo Main Board connect");
    }
}
