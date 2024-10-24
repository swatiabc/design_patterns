package lld.kafka.service;

import lld.kafka.repo.ProducerRepo;
import lld.kafka.repo.TopicRepo;

public class ProducerService {
    public void createProducer(String producerId) {
        ProducerRepo.addProducerMap(producerId);
    }

    public void publish(String producerId, String topicId, String message) {
        TopicRepo.addMessage(topicId, message);
        TopicRepo.addProducer(topicId, producerId);
        ProducerRepo.addTopic(producerId, topicId);
    }
}
