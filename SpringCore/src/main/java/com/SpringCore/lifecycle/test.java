package com.SpringCore.lifecycle;


import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
	private static AbstractApplicationContext context;
	public static void main(String[] args) {
		context = new ClassPathXmlApplicationContext("com/SpringCore/lifecycle/config.xml");
		department d1= (department)context.getBean("d1");
		System.out.println(d1);
		
		
		System.out.println("-------------------------");
		Emp e1=(emp)context.getBean("e1");
		System.out.println(e1);
		
		context.registerShutdownHook();
			}
		y

	}