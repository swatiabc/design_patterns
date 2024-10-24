package lld.kafka.dto;

import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;


public class Topic {
    String id;
    ArrayList<String> consumerList;
    ArrayList<String> producerList;
    ArrayList<String> messageList;
    Map<String, Integer> consumerOffset;

    public Topic(String id) {
        this.id = id;
        consumerList = new ArrayList<>();
        producerList = new ArrayList<>();
        messageList = new ArrayList<>();
        consumerOffset=new ConcurrentHashMap<>();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ArrayList<String> getConsumerList() {
        return consumerList;
    }

    public void setConsumerList(ArrayList<String> consumerList) {
        this.consumerList = consumerList;
    }

    public ArrayList<String> getProducerList() {
        return producerList;
    }

    public void setProducerList(ArrayList<String> producerList) {
        this.producerList = producerList;
    }

    public ArrayList<String> getMessageList() {
        return messageList;
    }

    public void setMessageList(ArrayList<String> messageList) {
        this.messageList = messageList;
    }

    public Map<String, Integer> getConsumerOffset() {
        return consumerOffset;
    }

    public void setConsumerOffset(Map<String, Integer> consumerOffset) {
        this.consumerOffset = consumerOffset;
    }



}
