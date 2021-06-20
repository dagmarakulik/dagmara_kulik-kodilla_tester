package com.kodilla.collections.adv.immutable.special.homework;

public class BookApplication {
    public static void main(String[] args) {


        Book book1 = BookManager.createBook("The Lord Of The Rings", "J.R.R. Tolkien");
        Book book2 = BookManager.createBook("Harry Potter", "J.K. Rowling");
        Book book3 = BookManager.createBook("Carrie", "Stephen King");
        Book book4 = BookManager.createBook("The Lord Of The Rings", "J.R.R. Tolkien");


        System.out.println("book1 has already existed: " + (book1.hashCode() == book2.hashCode()));

        System.out.println("book2 has already existed: " + (book1.hashCode() == book3.hashCode()));

        System.out.println("book3 has already existed: " + (book2.hashCode() == book3.hashCode()));

        System.out.println("book4 has already existed: " + (book1.hashCode() == book4.hashCode()));
    }
}
