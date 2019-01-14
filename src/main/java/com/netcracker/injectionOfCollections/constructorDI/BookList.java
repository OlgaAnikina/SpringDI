package com.netcracker.injectionOfCollections.constructorDI;

import com.netcracker.injectionOfCollections.Book;

import java.util.List;

public class BookList {
    List<Book> bookList;

    public BookList(List<Book> bookList) {
        this.bookList = bookList;
    }

    public List<Book> getBookList() {
        return bookList;
    }

    public int sizeOfBook() {
        return bookList.size();
    }
}
