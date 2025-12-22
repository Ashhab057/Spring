package com.jspider.springs.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");
        System.out.println("Program Start");

        //load configuration
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("beans.xml");

        Sample s1 = context.getBean("Sample", Sample.class);

       // Sample s1 = new Sample();

        s1.showValue();


        s1.increment();
        s1.showValue();


        s1.decrement();
        s1.showValue();



        System.out.println("Program End");

        }
    }
