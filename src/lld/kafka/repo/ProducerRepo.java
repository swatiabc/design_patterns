package lld.kafka.repo;

import lld.kafka.dto.Producer;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ProducerRepo {
    static Map<String, Producer> producerMap;

    public ProducerRepo() {
        producerMap = new ConcurrentHashMap<>();
    }

    public static Map<String, Producer> getProducerMap() {
        return producerMap;
    }

    public static void addProducerMap(String producerId) {
        Producer producer = new Producer(producerId);
        producerMap.put(producerId, producer);
    }

    public static void addTopic(String producerId, String topicId) {
        Producer producer = producerMap.get(producerId);
        producer.getTopicList().add(topicId);
    }
}
