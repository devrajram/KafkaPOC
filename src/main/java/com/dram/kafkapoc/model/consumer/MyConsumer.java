package com.dram.kafkapoc.model.consumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class MyConsumer {
	
	@KafkaListener(topics="kafkapoc", group="group1")
	public void consumeMessage(String message) {
		System.out.println("Consumed Message>> " + message);
	}
}
