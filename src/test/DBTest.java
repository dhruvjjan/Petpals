//package test;
//
//
//import java.sql.Connection;
//import java.sql.SQLException;
//import util.DBConnectionUtil;
//
//public class DBTest {
//    public static void main(String[] args) {
//        Connection connection = null;
//        try {
//            // Get a connection to the database
//            connection = DBConnectionUtil.getConnection();
//            System.out.println("Connected to the database successfully!");
//        } catch (SQLException e) {
//            System.out.println("Database connection failed!");
//            e.printStackTrace();
//        } finally {
//            // Close the connection
//            if (connection != null) {
//                try {
//                    connection.close();
//                    System.out.println("Connection closed.");
//                } catch (SQLException e) {
//                    e.printStackTrace();
//                }
//            }
//        }
//    }
//}
