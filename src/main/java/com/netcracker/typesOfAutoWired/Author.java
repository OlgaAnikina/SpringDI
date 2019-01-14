package com.netcracker.typesOfAutoWired;

public class Author implements AuthorBook {
    private String name;
    private Book book;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public void write() {
        System.out.println("Author's name: " + name);
        book.written();
    }
}
