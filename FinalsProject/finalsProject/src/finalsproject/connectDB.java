/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package finalsproject;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class connectDB {
    private static Connection connection = null;
    private static final String URL = "jdbc:mysql://localhost:3306/lostandfound";
    private static final String USER = "root";
    private static final String PASSWORD = "";

    // Private constructor to prevent instantiation
    private connectDB() {}

    // Method to get the database connection
    public static Connection getConnection() {
        if (connection == null) {
            try {
                connection = DriverManager.getConnection(URL, USER, PASSWORD);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return connection;
    }

//    // Optional: Method to close the connection
//    public static void closeConnection() {
//        if (connection != null) {
//            try {
//                connection.close();
//                connection = null; // Set to null after closing
//            } catch (SQLException e) {
//                e.printStackTrace();
//            }
//        }
//    }
}