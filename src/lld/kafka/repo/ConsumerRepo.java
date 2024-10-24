package lld.kafka.repo;

import lld.kafka.dto.Consumer;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ConsumerRepo {
    static Map<String, Consumer> consumerMap;

    public ConsumerRepo() {
        consumerMap = new ConcurrentHashMap<>();
    }

    public static Map<String, Consumer> getConsumerMap() {
        return consumerMap;
    }

    public static void addConsumerMap(String consumerId) {
        Consumer consumer = new Consumer(consumerId);
        consumerMap.put(consumerId, consumer);
    }

    public static void addTopic(String consumerId, String topicId) {
        Consumer consumer = consumerMap.get(consumerId);
        consumer.getTopicList().add(topicId);
    }
}
