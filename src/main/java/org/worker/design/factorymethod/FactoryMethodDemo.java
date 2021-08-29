package org.worker.design.factorymethod;

public class FactoryMethodDemo {
    public static void main(String[] args) {

        IPay weiXinPay = new WeiXinPayFactory().createPayment();
        weiXinPay.pay();

        IPay zhiFuBaoPay = new ZhiFuBaoPayFactory().createPayment();
        zhiFuBaoPay.pay();
    }
}
