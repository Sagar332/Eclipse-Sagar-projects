package com.Spring.jdbc;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * Hello world!
 *
 */
public class App 
{
	
    public static void main( String[] args )
    {
    
        System.out.println( "Hello World!" );
       ApplicationContext c = new ClassPathXmlApplicationContext("com/Spring/jdbc/config.xml");
        JdbcTemplate t=c.getBean("jdbcTemplate",JdbcTemplate.class);
        String q="insert into emp_data(eid,ename,salary) value(101,'sagar',23456)";
        
        int result=t.update(q);
        
        System.out.println("record inserted");
    }
}
