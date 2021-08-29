package org.worker.design.factorymethod;

public class WeiXinPay implements IPay {
    @Override
    public void pay() {
        System.out.println("Pay by weixin");
    }
}
