package com.dram.kafkapoc.controller;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.dram.kafkapoc.service.KafkaService;

@RestController
public class KafkaController {
	@Autowired
	KafkaService kafkaService;
	
	
	@GetMapping(path="/greeting")
	public String greeting() {
		String[] months = {"January", "February", "March", "April", "May", "June", "July", "August",
				"September", "October", "November", "December"};
		Arrays.asList(months).stream().filter(s->s.startsWith("Dec")).forEach(s->System.out.println(s));
		
		
		
		return "Hello, Kafka!";
	}
	
	@GetMapping(path="/send/{message}")
	public String sendMessage(@PathVariable("message") String message) {
		kafkaService.sendMessage(message);
		return "Hello, Kafka!";
	}
	
}
