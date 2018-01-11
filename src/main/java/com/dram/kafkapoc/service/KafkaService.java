package com.dram.kafkapoc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dram.kafkapoc.model.consumer.MyConsumer;
import com.dram.kafkapoc.model.producer.MyProducer;

@Service
public class KafkaService {

	@Autowired
	MyProducer producer;
	
	@Autowired
	MyConsumer consumer;
	
	public void sendMessage(String message) {
		producer.sendMessage("kafkapoc", message);
	}
	
}
