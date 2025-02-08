package org.libr.repositories;
import org.libr.database.DatabaseConnection;
import org.libr.models.User;
import java.sql.*;

public class UserRepository {
    public void addUser(User user) {
        String query = "INSERT INTO Users (name, email) VALUES (?, ?)";
        try (Connection connection = DatabaseConnection.getInstance();
             PreparedStatement stmt = connection.prepareStatement(query)) {
            stmt.setString(1, user.getName());
            stmt.setString(2, user.getEmail());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
