package com.netcracker.injectionOfCollections.setterDI;



import com.netcracker.injectionOfCollections.Book;

import java.util.Set;

public class BookSet {
    Set<Book> bookSet;

    public Set<Book> getBookSet() {
        return bookSet;
    }

    public void setBookSet(Set<Book> set) {
        this.bookSet = set;
    }

    public int sizeofBook() {
        return bookSet.size();
    }
}
