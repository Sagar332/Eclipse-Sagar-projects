package com.SpringCore.autowire;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
	
	private static AbstractApplicationContext context;

	public static void main(String[] args) {
		
		context = new ClassPathXmlApplicationContext("com/SpringCore/autowire/config.xml");
		Question q1 =(Question)context.getBean("Q1");
		System.out.println(q1);
		

	}

}


