/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package finalsproject;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class connectDB {
    private static connectDB instance = null; // Singleton instance
    private Connection connection; // Database connection
    private static final String URL = "jdbc:mysql://localhost:3306/lostandfound"; // Database URL
    private static final String USER = "root"; // Database user
    private static final String PASSWORD = ""; // Database password

    // Private constructor to prevent instantiation
    private connectDB() {
        try {
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Public static method to get the instance
    public static connectDB getInstance() {
        if (instance == null) { // Check if the instance is null
            instance = new connectDB(); // Create a new instance if it doesn't exist
        }
        return instance; // Return the single instance
    }

    // Method to get the connection
    public Connection getConnection() {
        // Check if the connection is closed, and if so, create a new one
        try {
            if (connection == null || connection.isClosed()) {
                connection = DriverManager.getConnection(URL, USER, PASSWORD);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection; // Return the active connection
    }

    // Optional: Method to close the connection when the application is exiting
    public static void closeConnection() {
        if (instance != null && instance.connection != null) {
            try {
                instance.connection.close(); // Close the connection
                instance.connection = null; // Set to null after closing
                instance = null; // Remove the instance
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}