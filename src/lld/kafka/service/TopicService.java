package lld.kafka.service;

import lld.kafka.repo.TopicRepo;

public class TopicService {

    public void createTopic(String topicId) {
        TopicRepo.addTopicMap(topicId);
    }

}
