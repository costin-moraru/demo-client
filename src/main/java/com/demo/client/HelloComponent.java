package com.demo.client;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class HelloComponent {
	
	@Scheduled(fixedRate = 1000)
	public void printHello() {
		System.out.println("Hello world!");
	}

}
