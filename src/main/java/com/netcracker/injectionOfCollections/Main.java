package com.netcracker.injectionOfCollections;

import com.netcracker.injectionOfCollections.setterDI.BookList;
import com.netcracker.injectionOfCollections.setterDI.BookMap;
import com.netcracker.injectionOfCollections.setterDI.BookSet;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("injectionOfCollections.xml");

        System.out.println("injection with SETTERS:");
        BookList bookListSetterDI = (BookList)context.getBean("bookList1");
        BookSet bookSetSetterDI = (BookSet)context.getBean("bookSet1");
        BookMap bookMapSetterDI = (BookMap)context.getBean("bookMap1");
        System.out.println("Of LIST:");
        System.out.println(bookListSetterDI.sizeOfBook());
        System.out.println(bookListSetterDI);

        System.out.println("Of SET:");
        System.out.println(bookSetSetterDI.sizeofBook());
        System.out.println(bookSetSetterDI);

        System.out.println("Of MAP:");
        System.out.println(bookMapSetterDI.sizeBook());
        System.out.println(bookMapSetterDI);

        System.out.println("injection with constructor:");
        com.netcracker.injectionOfCollections.constructorDI.BookList bookListConstructorDI
                = (com.netcracker.injectionOfCollections.constructorDI.BookList)context.getBean("bookList");
        com.netcracker.injectionOfCollections.constructorDI.BookMap bookMapConstructorDI
                = (com.netcracker.injectionOfCollections.constructorDI.BookMap)context.getBean("bookMap");
        com.netcracker.injectionOfCollections.constructorDI.BookSet bookSetConstructorDI
                = (com.netcracker.injectionOfCollections.constructorDI.BookSet)context.getBean("bookSet");

        System.out.println("Of LIST:");
        System.out.println(bookListConstructorDI.sizeOfBook());
        System.out.println(bookListConstructorDI);

        System.out.println("Of SET:");
        System.out.println(bookSetConstructorDI.sizeOfBookSet());
        System.out.println(bookSetConstructorDI);

        System.out.println("Of MAP:");
        System.out.println(bookMapConstructorDI.sizeofBookMap());
        System.out.println(bookMapConstructorDI);


    }
}
