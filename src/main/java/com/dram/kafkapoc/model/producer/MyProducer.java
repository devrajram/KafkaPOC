package com.dram.kafkapoc.model.producer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
public class MyProducer {
	@Autowired
	KafkaTemplate<String, String> kafkaTemplate;
	
	public void sendMessage(String topic, String message) {
		kafkaTemplate.send(topic, message);
		System.out.println("Message Sent to topic >> " + topic);
	}

}
