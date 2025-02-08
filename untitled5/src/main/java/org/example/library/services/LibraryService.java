package org.libr.services;
import org.libr.models.Book;
import org.libr.models.User;
import org.libr.patterns.BookNotifier;
import org.libr.repositories.BookRepository;
import org.libr.repositories.UserRepository;

public class LibraryService {
    private BookRepository bookRepository = new BookRepository();
    private UserRepository userRepository = new UserRepository();
    private BookNotifier bookNotifier = new BookNotifier();

    public void borrowBook(User user, Book book) {
        if (!book.isBorrowed()) {
            book.setBorrowed(true);
            bookRepository.borrowBook(book.getId(), user.getId());
            System.out.println(user.getName() + " borrowed " + book.getTitle());
        } else {
            System.out.println("Book is already borrowed!");
        }
    }
}
