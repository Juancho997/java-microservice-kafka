package com.juanbonino;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaListeners {

    @KafkaListener(topics = "testTopic", groupId = "testGroupId")
    void listeners(String data){
        System.out.println("testTopic Listener received > " + data);
    }

}
