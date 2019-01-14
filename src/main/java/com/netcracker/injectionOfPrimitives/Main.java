package com.netcracker.injectionOfPrimitives;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("injectionOfPrimitives.xml");
        Cat pers = (Cat) context.getBean("pers");
        Cat nePers = (Cat) context.getBean("nePers");
        Dog buldog = (Dog) context.getBean("buldog");
        Dog ovcharca = (Dog) context.getBean("ovcharca");

        System.out.println("Setters:");
        System.out.println("weight: " + pers.getWeight() + "move: " + pers.getAnimal());
        System.out.println("weight: " + nePers.getWeight() + "move: " + nePers.getAnimal());
        System.out.println("Constructor:");
        System.out.println("weight: " + buldog.getWeight() + "move: " + buldog.getAnimal());
        System.out.println("weight: " + ovcharca.getWeight() + "move: " + ovcharca.getAnimal());

    }
}
