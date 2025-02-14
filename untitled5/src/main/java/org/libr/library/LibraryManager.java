package org.libr.library;

import org.libr.library.models.Book;
import org.libr.library.services.BookService;


public class LibraryManager {
    public static void main(String[] args) {
        BookService bookService = new BookService();

        // Adding a book to the library
        Book newBook = new Book(0, "1984", "George Orwell", true);
        bookService.addBook(newBook);

        System.out.println("Book added successfully!");
    }
}
