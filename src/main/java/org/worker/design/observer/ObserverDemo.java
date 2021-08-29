package org.worker.design.observer;

/**
 * 观察者模式
 * 定义一种一对多的依赖关系，一个主题对象可被多个观察者对象同时监听，
 * 使得每当主题对象状态变化时，所有依赖于它的对象都会得到通知
 */
public class ObserverDemo {

    public static void main(String[] args) {

        KafkaServer kafkaServer = new KafkaServer();

        Topic1Consumer topic1Consumer = new Topic1Consumer("topic1");
        topic1Consumer.register(kafkaServer);

        kafkaServer.receive("topic1", "hello world!");
    }
}
