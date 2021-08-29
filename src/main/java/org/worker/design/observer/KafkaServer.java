package org.worker.design.observer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class KafkaServer {

    private Map<String, List<KafkaConsumer>> observer = new HashMap<>();

    public void addConsumer(KafkaConsumer consumer) {
        if(observer.containsKey(consumer.getTopic())) {
            observer.get(consumer.getTopic()).add(consumer);
        }else {
            List<KafkaConsumer> consumers = new ArrayList<>();
            consumers.add(consumer);
            observer.put(consumer.getTopic(), consumers);
        }
    }

    public void receive(String topic, String content) {
        System.out.println(topic + ": receive - " + content);
        notifyAllConsumers(topic, content);
    }

    public void notifyAllConsumers(String topic, String content) {
        if(observer.containsKey(topic)) {
            for(KafkaConsumer kafkaConsumer : observer.get(topic)) {
                kafkaConsumer.consume(content);
            }
        }
    }

}
