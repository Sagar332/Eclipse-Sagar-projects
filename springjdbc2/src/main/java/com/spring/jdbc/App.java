package com.spring.jdbc;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.jdbc.dao.EmpDao;
import com.spring.jdbc.entity.Employee;


/**
 * Hello world!
 *
 */
public class App 
{
    private static ApplicationContext e;
	public static void main( String[] args )
    {
//      System.out.println( "Hello World!" );
		ApplicationContext c = new ClassPathXmlApplicationContext("com/spring/jdbc/config.xml");
    	
    	///c = new ClassPathXmlApplicationContext("com/spring/jdbc/config.xml");
    	EmpDao cd = c.getBean("EmpDao",EmpDao.class);
    	
    	
    	
//    	Employee e1=new Employee();
//    	e1.setEid(272);
//    	e1.setEname("Sagar singh");
//    	e1.setDname("Accountant");
//    	int r = cd.insert(e1);
    	//System.out.println("Record inserted" +r);
//    	
    	Employee a1=new Employee();
    	a1.setEid(272);
    	a1.setEname("Sagar singh");
    	int c1=cd.update(a1);
    	
    	System.out.println("Record inserted" +c1);
    	
    	Employee s1=new Employee();
    	s1.setEid(272);
    	int p=cd.delete(s1);
    	System.out.println("Record deleted" +p);
    	
    	Employee c11=cd.getEmployee(111);
    	System.out.println(c11);
    	
    	List<Employee> employee=EmpDao.getAllEmp();
    	for(Employee c2:employee) {
    		System.out.println(c2);
    	}
    	
    }
}
