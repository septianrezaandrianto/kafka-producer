package com.rnd.kafkaproducer;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.kafka.core.KafkaTemplate;

@SpringBootApplication
public class KafkaProducerApplication {

	public static void main(String[] args) {
		SpringApplication.run(KafkaProducerApplication.class, args);
	}

//	@Value("${spring.kafka.producer.topic}")
//	private String topic;
//
//	@Bean
//	CommandLineRunner commandLineRunner(KafkaTemplate<String, String> kafkaTemplate) {
//		return args -> {
//			for (int i=0; i < 10; i++) {
//				kafkaTemplate.send(topic, "Testing Kafka Ke : " + i);
//			}
//		};
//	}

}
