package com.netcracker.typesOfAutoWired;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        System.out.println(" BY TYPE:");
        ApplicationContext contextByType =
                new ClassPathXmlApplicationContext("typesOfAutoWiredByType.xml");
        Author authorByType = (Author) contextByType.getBean("tolstoy");
        authorByType.write();

        System.out.println(" BY NAME:");
        ApplicationContext contextByName =
                new ClassPathXmlApplicationContext("typesOfAutoWiredByName.xml");
        Author authorByName = (Author) contextByName.getBean("tolstoy");
        authorByName.write();

        System.out.println(" BY Constructor:");
        ApplicationContext contextByConstructor =
                new ClassPathXmlApplicationContext("typesOfAutoWiredByConstructor.xml");
        BooksConstructor booksConstructor = (BooksConstructor) contextByConstructor.getBean("tolstoy");
        booksConstructor.write();

    }
}
