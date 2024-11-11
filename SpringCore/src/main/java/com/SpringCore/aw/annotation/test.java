package com.SpringCore.aw.annotation;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
	
	private static AbstractApplicationContext context;

	public static void main(String[] args) {
		
		context = new ClassPathXmlApplicationContext("com/SpringCore/aw/annotation/config.xml");
		Question q1 =(Question)context.getBean("q1");
		System.out.println(q1);
		

	}

}


