package com.netcracker.injectionOfCollections.constructorDI;

import com.netcracker.injectionOfCollections.Book;

import java.util.Set;

public class BookSet {
    Set<Book> bookSet;

    public BookSet(Set<Book> bookSet) {
        this.bookSet = bookSet;
    }

    public Set<Book> getBookSet() {
        return bookSet;
    }

    public int sizeOfBookSet() {
        return bookSet.size();
    }
}
