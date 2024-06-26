package com.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        // new Employee(); Tight Coupling.

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        context.start();

        Employee employee = (Employee) context.getBean("employee");

        System.out.println(employee);
    }
}
