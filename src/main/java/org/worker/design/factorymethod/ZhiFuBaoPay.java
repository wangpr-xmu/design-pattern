package org.worker.design.factorymethod;

public class ZhiFuBaoPay implements IPay {
    @Override
    public void pay() {
        System.out.println("Pay by zhifubao");
    }
}
