package com.netcracker.injectionOfCollections.setterDI;

import com.netcracker.injectionOfCollections.Book;

import java.util.List;

public class BookList {
    List<Book> bookList;

    public void setBookList(List<Book> list) {
        this.bookList = list;
    }

    public List<Book> getBookList() {
        return bookList;
    }

    public int sizeOfBook() {
        return bookList.size();
    }
}
