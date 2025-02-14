package org.libr.library.services;

import org.libr.library.DatabaseConnection;
import org.libr.library.models.Book;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class BookService {
    public void addBook(Book book) {
        String sql = "INSERT INTO books (title, author, is_available) VALUES (?, ?, ?)";

        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, book.getTitle());
            stmt.setString(2, book.getAuthor());
            stmt.setBoolean(3, book.isAvailable());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
