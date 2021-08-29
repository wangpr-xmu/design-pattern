package org.worker.design.observer;

public abstract class KafkaConsumer {
    protected String topic;

    public KafkaConsumer(String topic) {
        this.topic = topic;
    }

    public abstract void consume(String content);
    public abstract void register(KafkaServer kafkaServer);

    public String getTopic() {
        return topic;
    }
}
