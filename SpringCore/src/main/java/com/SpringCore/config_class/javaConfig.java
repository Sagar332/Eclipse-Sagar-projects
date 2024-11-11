package com.SpringCore.config_class;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component("p1")
@Configuration
@ComponentScan(basePackages="com.SpringCore.config_remove")
public class javaConfig {
	
	@Bean 
	public Person getPerson()
	
	{
		Person p1=new Person();
		return p1;
	}
	

}
