package lld.kafka;

import lld.kafka.repo.ConsumerRepo;
import lld.kafka.repo.ProducerRepo;
import lld.kafka.repo.TopicRepo;
import lld.kafka.service.ConsumerService;
import lld.kafka.service.ProducerService;
import lld.kafka.service.TopicService;

public class Client {

    public static void main(String[] args) {
        TopicRepo topicRepo = new TopicRepo();
        ProducerRepo producerRepo = new ProducerRepo();
        ConsumerRepo consumerRepo = new ConsumerRepo();

        ConsumerService consumerService = new ConsumerService();
        ProducerService producerService = new ProducerService();
        TopicService topicService = new TopicService();

        topicService.createTopic("topic1");
        topicService.createTopic("topic2");

        System.out.println(TopicRepo.getTopicMap());

        producerService.createProducer("producer1");
        producerService.createProducer("producer2");

        System.out.println(ProducerRepo.getProducerMap());

        consumerService.addConsumer("consumer1");
        consumerService.addConsumer("consumer2");
        consumerService.addConsumer("consumer3");
        consumerService.addConsumer("consumer4");
        consumerService.addConsumer("consumer5");

        System.out.println(ConsumerRepo.getConsumerMap());

        consumerService.subscribe("topic1", "consumer1");
        consumerService.subscribe("topic1", "consumer2");
        consumerService.subscribe("topic1", "consumer3");
        consumerService.subscribe("topic1", "consumer4");
        consumerService.subscribe("topic1", "consumer5");
        consumerService.subscribe("topic2", "consumer1");
        consumerService.subscribe("topic2", "consumer3");
        consumerService.subscribe("topic2", "consumer4");

        System.out.println(ConsumerRepo.getConsumerMap().get("consumer1").getTopicList());
        System.out.println(TopicRepo.getTopicMap().get("topic1").getConsumerList());

        producerService.publish("producer1", "topic1", "message 1");

        System.out.println(ProducerRepo.getProducerMap().get("producer1"));

        Runnable job = consumerService::pullMessage;
        Thread t1 = new Thread(job);
        t1.start();
    }

}
