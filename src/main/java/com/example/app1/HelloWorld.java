package com.example.app1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
@SpringBootApplication
public class HelloWorld {

	public static void main(String[] args) {
		SpringApplication.run(HelloWorld.class, args);
		System.out.println("Hello world");

	}

	@Bean
	public HellService getHellService() {
		return new HelloServiceImpl();
	}

	public void run(String... args) throws Exception {
		getHellService().hello();
	}
}
