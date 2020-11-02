package org.worker.observer;

public class ObserverClient {
    public static void main(String[] args) {
        KafkaServer kafkaServer = new KafkaServer();

        Topic1Consumer topic1Consumer = new Topic1Consumer("topic1");
        topic1Consumer.register(kafkaServer);

        kafkaServer.receive("topic1", "hello world!");
    }
}
