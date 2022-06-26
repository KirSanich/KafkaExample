package com.example.kafkaexample;

import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Configuration
public class KafkaConsumerConfiguration {

    @KafkaListener(topics = "myTopic",groupId ="my_group_id")
    public void getMessage(String message)
    {
        System.out.println(message);
    }
}
