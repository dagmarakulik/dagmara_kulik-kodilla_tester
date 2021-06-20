package com.kodilla.collections.adv.immutable.special.homework;

import java.util.ArrayList;
import java.util.List;

public class BookManager {
    static List<Book> bookLibrary = new ArrayList<>();

    public static Book createBook(String title, String author) {
        Book book = new Book(title, author);
        if (bookLibrary.contains(book))
            System.out.println(title + " already exists");

        bookLibrary.add(book);
        return book;
    }
}