package org.worker.design.abstractfactory;

public class AppleComputeFactory extends AbstractComputeFactory {
    @Override
    Cpu createCpu() {
        return new CoreCpu();
    }

    @Override
    MainBoard createMainBoard() {
        return new AppleMainBoard();
    }
}
