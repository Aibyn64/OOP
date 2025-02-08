package org.libr;
import org.libr.database.DatabaseConnection;
import java.sql.Connection;

public class Main {
    public static void main(String[] args) {
        try {
            Connection connection = DatabaseConnection.getInstance();
            System.out.println("Connected to PostgreSQL successfully!");
        } catch (Exception e) {
            System.out.println("Database connection failed: " + e.getMessage());
        }
    }
}
