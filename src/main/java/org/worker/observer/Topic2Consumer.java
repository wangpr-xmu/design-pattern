package org.worker.observer;

public class Topic2Consumer extends KafkaConsumer {
    public Topic2Consumer(String topic) {
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
