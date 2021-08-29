package org.worker.design.abstractfactory;

public class LenovoComputerFactory extends AbstractComputeFactory {
    @Override
    Cpu createCpu() {
        return new AMDCpu();
    }

    @Override
    MainBoard createMainBoard() {
        return new LenovoMainBoard();
    }
}
