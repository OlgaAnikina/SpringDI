package com.netcracker.typesOfAutoWired;

import com.netcracker.typesOfAutoWired.AuthorBook;
import com.netcracker.typesOfAutoWired.Book;

public class BooksConstructor implements AuthorBook {
    private String price;
    private Book book;

    public BooksConstructor(String price, Book book) {
        this.price = price;
        this.book = book;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public void write() {
        System.out.println("Book's price: "+ price);
        book.written();
    }
}
