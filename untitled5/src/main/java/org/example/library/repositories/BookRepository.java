package org.libr.repositories;
import org.libr.database.DatabaseConnection;
import org.libr.models.Book;
import java.sql.*;

public class BookRepository {
    public void returnBook(int bookId) {
        String query = "UPDATE Books SET isBorrowed = FALSE WHERE id = ?";
        try (Connection connection = DatabaseConnection.getInstance();
             PreparedStatement stmt = connection.prepareStatement(query)) {
            stmt.setInt(1, bookId);
            stmt.executeUpdate();

            // Notify users about availability
            System.out.println("Book " + bookId + " is now available.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
