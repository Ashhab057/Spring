package com.jspider.springs.demo;

import com.jspider.springs.demo.ContactInfo;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DependencyInjectionDemo {
    public static void main(String[] args) {
        System.out.println("Program starts");
        //ContactInfo contact = new ContactInfo();
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        Employee e1 = context.getBean("employee", Employee.class);
        System.out.println(e1.getContact());
        System.out.println(e1.getAddress());

        System.out.println("Program ends");
    }
}