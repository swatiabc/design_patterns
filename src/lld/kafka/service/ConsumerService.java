package lld.kafka.service;

import lld.kafka.dto.Consumer;
import lld.kafka.dto.Topic;
import lld.kafka.repo.ConsumerRepo;
import lld.kafka.repo.TopicRepo;

import java.util.ArrayList;
import java.util.Map;

public class ConsumerService {
    Map<String, Consumer> consumerMap = ConsumerRepo.getConsumerMap();
    public void addConsumer(String consumerId) {
        ConsumerRepo.addConsumerMap(consumerId);
    }

    public void subscribe(String topicId, String consumerId) {
        TopicRepo.addConsumer(topicId, consumerId, 0);
        ConsumerRepo.addTopic(consumerId, topicId);
    }

    public void consumer(String consumerId) {
        Consumer consumer = consumerMap.get(consumerId);

        ArrayList<String> topicList = consumer.getTopicList();

        for(String topicId: topicList) {
            Topic topic = TopicRepo.getTopicMap().get(topicId);
            Integer consumerOffSet = topic.getConsumerOffset().get(consumerId);

            if (consumerOffSet >= topicList.size()) {
                continue;
            }
            String message = topic.getMessageList().get(consumerOffSet);
            topic.getConsumerOffset().put(consumerId, consumerOffSet+1);

            System.out.println("Message: "+message+" consumer id: "+consumerId+" topic id: "+topicId);
        }
    }

    public void pullMessage() {
        while(true) {
            System.out.println("length: "+ consumerMap.keySet());
            for(String consumerId: consumerMap.keySet())
            {
                consumer(consumerId);
            }
        }
    }
}
