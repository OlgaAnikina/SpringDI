package com.netcracker.lookUpInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        System.out.println("Look up");
        ApplicationContext context = new ClassPathXmlApplicationContext("lookUpInjection.xml");
        ICar workedCar = (ICar) context.getBean("worked");
        ICar garage = (ICar) context.getBean("garage");
        System.out.println(workedCar.getCar());
        System.out.println(garage.getCar());

    }

}
