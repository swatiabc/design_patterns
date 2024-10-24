package lld.kafka.repo;

import lld.kafka.dto.Topic;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class TopicRepo {
    static Map<String, Topic> topicMap;

    public TopicRepo() {
        topicMap = new ConcurrentHashMap<>();
    }

    public static Map<String, Topic> getTopicMap() {
        return topicMap;
    }

    public static void addTopicMap(String topicId) {
        Topic topic = new Topic(topicId);
        topicMap.put(topicId, topic);
    }

    public static void addConsumer(String topicId, String consumerId, Integer consumerOffSet) {
        Topic topic = topicMap.get(topicId);
        topic.getConsumerList().add(consumerId);
        topic.getConsumerOffset().put(consumerId, consumerOffSet);
    }

    public static void addMessage(String topicId, String message) {
        Topic topic = topicMap.get(topicId);
        topic.getMessageList().add(message);
    }

    public static void addProducer(String topicId, String producerId) {
        Topic topic = topicMap.get(topicId);
        topic.getProducerList().add(producerId);
    }
}
