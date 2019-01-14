package com.netcracker.factoryMethod;

import com.netcracker.typesOfAutoWired.Author;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("factoryMethod.xml");
        Author author = (Author) context.getBean("tolstoy");
        author.write();
    }
}
