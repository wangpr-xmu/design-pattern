package org.worker.design.observer;

public class Topic1Consumer extends KafkaConsumer {
    public Topic1Consumer(String topic) {
        super(topic);
    }

    @Override
    public void consume(String content) {
        System.out.println(topic + ": " + content);
    }

    @Override
    public void register(KafkaServer kafkaServer) {
        kafkaServer.addConsumer(this);
    }
}
