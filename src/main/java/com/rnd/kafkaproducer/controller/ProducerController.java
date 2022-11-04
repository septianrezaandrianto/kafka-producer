package com.rnd.kafkaproducer.controller;

import com.google.gson.Gson;
import com.rnd.kafkaproducer.request.ProducerRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ProducerController {

    @Autowired
    private KafkaTemplate kafkaTemplate;

    @Value("${spring.kafka.producer.topic}")
    private String topic;

    @PostMapping("/sendData")
    public String sendData(@RequestBody ProducerRequest producerRequest) {
        Gson gson = new Gson();
        kafkaTemplate.send(topic,  gson.toJson(producerRequest));
        return "SUCCESS";
    }

}
