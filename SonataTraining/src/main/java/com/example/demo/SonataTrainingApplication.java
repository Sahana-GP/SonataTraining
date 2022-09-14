package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SonataTrainingApplication {

	public static void main(String[] args) {
		SpringApplication.run(SonataTrainingApplication.class, args);
		AddInterface addition = new DefaultAddition();
		System.out.println(addition.add(10, 20));
	}

}
