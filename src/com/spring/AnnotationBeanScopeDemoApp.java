package com.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp {

    public static void main(String[] args) {

        //load spring config file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // retrieve bean from spring container
        Coach theCoach = context.getBean("tennisCoach", Coach.class);

        Coach alpahCoach = context.getBean("tennisCoach", Coach.class);

        boolean result = (theCoach == alpahCoach);

        //print out the results
        System.out.println("\nPointing to the same objects: " + result);

        System.out.println("\nMemory location for: " + theCoach);

        System.out.println("\nMemory location for: " + alpahCoach);

        context.close();

    }
}
