package com.netcracker.inheritanceOfBeans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("inheritanceOfBeans.xml");
        Car car = (Car)context.getBean("car");
        System.out.println("Info about Config: ");
        System.out.println("Name of car: " + car.getName());
        System.out.println("count of wheels: " + car.getCountOfWheels());
        Truck truck = (Truck)context.getBean("truck");
        System.out.println("Info about Truck: ");
        System.out.println("Name of car: " + truck.getCountOfWheels());
        System.out.println("count of wheels: " + truck.getName());
        System.out.println("Fuel Сonsumption: "+ truck.getFuelСonsumption());
        System.out.println("Potencia: "+ truck.getPotencia());

    }
}
