package com.SCore.midsem;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
    private static ApplicationContext context;

    public static void main(String[] args) {
        context = new ClassPathXmlApplicationContext("com/SCore/midsem/config.xml");

        emp e = (emp) context.getBean("e3", emp.class);
        System.out.println(e.getId());
        System.out.println(e.getName());
        System.out.println(e.getAddress());
    }
}
