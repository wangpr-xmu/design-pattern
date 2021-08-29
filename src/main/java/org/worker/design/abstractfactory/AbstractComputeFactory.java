package org.worker.design.abstractfactory;

public abstract class AbstractComputeFactory {
    abstract Cpu createCpu();
    abstract MainBoard createMainBoard();
}
