package com.SpringCore.standalone.collection;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
	
	private static AbstractApplicationContext context;

	public static void main(String[] args) {
		
		context = new ClassPathXmlApplicationContext("com/score/standalone/collection/config.xml");
		employee p1 =(employee)context.getBean("emp1");
		System.out.println(p1.getEname());
		

	}

}
