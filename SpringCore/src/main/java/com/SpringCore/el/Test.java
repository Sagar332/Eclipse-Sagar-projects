package com.SpringCore.el;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
 public static void main(String[] args) {
	
	 ApplicationContext context =new ClassPathXmlApplicationContext("com/SpringCore/el/config.xml");
	 Demo s1=context.getBean("demo", Demo.class);
	 System.out.println(s1);
	 
	// System.out.println(s1.hashCode());
	 //Student s2= context.getBean("student",Student.class);
	 //System.out.println(s2.hashCode());
	
 }
}