package com.netcracker.factoryMethod;

import com.netcracker.typesOfAutoWired.Author;
import com.netcracker.typesOfAutoWired.Book;

public class HomeBook {
    public Author createAuthor() {
        Book warAndPeace = new Book() {
            public void written() {
                System.out.println("Book was written");
            }
        };
        Author author = new Author();
        author.setBook(warAndPeace);
        author.setName("tolstoy");
        return author;
    }
}
