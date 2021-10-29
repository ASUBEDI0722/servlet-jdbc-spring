package com.oms.config;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppInit {
	
	public static void main(String[] args) {
		//ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("application-context.xml");

		
	}

}
