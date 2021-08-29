package org.worker.design.factorymethod;

public class WeiXinPayFactory implements IPayFactory {
    @Override
    public IPay createPayment() {
        return new WeiXinPay();
    }
}
