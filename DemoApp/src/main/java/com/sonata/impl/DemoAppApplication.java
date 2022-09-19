package com.sonata.impl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.sonata.spring.Calculator;


@SpringBootApplication
public class DemoAppApplication {

	public static void main(String[] args) {

		ApplicationContext ctx = SpringApplication.run(DemoAppApplication.class, args);	
		
		//Calculator add = (Calculator) ctx.getBean("defaultCalculatorImpl");
		//int r = add.callAdd(100, 200);
	//	System.out.println(r);
		
	}

}
