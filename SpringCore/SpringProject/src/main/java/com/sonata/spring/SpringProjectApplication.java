package com.sonata.spring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//import com.example.demo.impl.DefaultAdditionImpl;
//import com.example.demo.impl.DefaultGreeting;

@SpringBootApplication
public class SpringProjectApplication {
	
	public static void main(String[] args) {

		ApplicationContext ctx = SpringApplication.run(SpringProjectApplication.class, args);
		//GreetingInterface  greeting = new DefaultGreeting();
		//BeanFactory factory = new ClassPathXmlApplicationContext("beans.xml");
		//CallGreetingInterface  greeting = (CallGreetingInterface) ctx.getBean("abc");
		//System.out.println(greeting.callGreeting("Ganesh"));
		
		BeanFactory factory = new ClassPathXmlApplicationContext("beans.xml");
		Calculator add = (Calculator) factory.getBean("calc");
		int r = add.callAdd(100, 200);
		System.out.println(r);
	}

}
