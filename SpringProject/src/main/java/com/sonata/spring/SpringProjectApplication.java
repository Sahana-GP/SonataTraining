package com.sonata.spring;

/*import org.apache.catalina.core.ApplicationContext;
import org.apache.naming.factory.BeanFactory;
import org.springframework.beans.BeansException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;*/
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.sonata.spring.LoginInterface;

@SpringBootApplication
public class SpringProjectApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(SpringProjectApplication.class, args);
		//ApplicationContext ctx = SpringApplication.run(SpringProjectApplication.class, args);
	// = new ClassPathXmlApplicationContext("beans.xml");
	Calculator add = (Calculator) ctx.getBean("defaultCalculatorImpl");
	int r = add.callAdd(100, 200);
	System.out.println(r);
	
	//ClassPathXmlApplicationContext factory = new ClassPathXmlApplicationContext("beans.xml");
			//LoginInterface li = (LoginInterface) factory.getBean("login");
			//OrderInterface placeOrder = (OrderInterface) factory.getBean("placeOrder");
			//int r = add.callAdd(100, 200);
			//System.out.println( li.login("sahana", "root@2022"));
			//System.out.println( login.placeOrder("nam", "pss", 7895));
			//OrderInterface o1 = (OrderInterface) factory.getBean("placeOrder");
			//System.out.println(o1.placeOrder("sahana", "root@2022", 7895));
		} 
	
	}
