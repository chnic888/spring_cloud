package com.chnic.eureka.consumer.client;

import org.springframework.stereotype.Component;

@Component
public class HelloClientFallback implements HelloClient {

	@Override
	public String sayHello(String title, String name) {
		return "ERROR";
	}

}
