package com.sonata.mvc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.sonata.controller"})
public class MvcSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(MvcSpringApplication.class, args);
	}

}
