package com.netcracker.spEL;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spEL.xml");
        Config config = (Config)context.getBean("config");
        System.out.println("Name: " + config.getName());
        System.out.println("count Of Wheels: " + config.getAge());
        System.out.println("Potencia: "+ config.getCountOfHomeAnimals());
    }
}


