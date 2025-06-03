package com.example.Kafkalogflow.service;

import org.springframework.stereotype.Service;
import org.springframework.kafka.annotation.KafkaListener;

@Service
public class LogConsumer {

    @KafkaListener(topics="logs", groupId = "log_group")
    public void listen(String message){
        System.out.println("Received log "+ message);
    }
}
