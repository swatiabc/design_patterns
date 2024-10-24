package lld.kafka.dto;

import java.util.ArrayList;

public class Producer {
    String id;
    ArrayList<String> topicList;

    public Producer(String id) {
        this.id = id;
        topicList = new ArrayList<>();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ArrayList<String> getTopicList() {
        return topicList;
    }

    public void setTopicList(ArrayList<String> topicList) {
        this.topicList = topicList;
    }

}
