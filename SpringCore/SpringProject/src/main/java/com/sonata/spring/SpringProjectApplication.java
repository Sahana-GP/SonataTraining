package com.example.demo;

import org.apache.catalina.core.ApplicationContext;
import org.apache.naming.factory.BeanFactory;
import org.springframework.beans.BeansException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sonata.spring.LoginInterface;

@SpringBootApplication
public class SpringProjectApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = (ApplicationContext) SpringApplication.run(SpringProjectApplication.class, args);
		try (ClassPathXmlApplicationContext factory = new ClassPathXmlApplicationContext("beans.xml")) {
			LoginInterface validateuser = (LoginInterface) factory.getBean("login");
			//int r = add.callAdd(100, 200);
			boolean n = validateuser.login("num", "pass");
			System.out.println(n);
		} catch (BeansException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}

}
