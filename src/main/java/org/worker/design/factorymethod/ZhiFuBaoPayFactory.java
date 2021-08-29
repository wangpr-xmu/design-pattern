package org.worker.design.factorymethod;

public class ZhiFuBaoPayFactory implements IPayFactory {
    @Override
    public IPay createPayment() {
        return new ZhiFuBaoPay();
    }
}
