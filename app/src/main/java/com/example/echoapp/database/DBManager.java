package com.example.echoapp.database;


import java.sql.*;

/**
 * GUARDARE DBHelper è la classe giusta, non DBManager!
 */
public class DBManager {

    public static String JDBC_Driver = null;
    public static String JDBC_URL = null;

    static Connection connection;

    public static void setConnection(String Driver, String URL) {
        JDBC_Driver = Driver;
        JDBC_URL = URL;
    }

    public static Connection getConnection() throws SQLException {
        if (connection == null) {
            if (JDBC_Driver == null || JDBC_URL == null) {
                throw new IllegalStateException("Illegal request. Call setConnection() before.");
            }
            try {
                Class.forName(JDBC_Driver);
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
            connection = DriverManager.getConnection(JDBC_URL);
            showMetadata();
        }
        return connection;
    }

    public static void showMetadata() throws SQLException {
        if (connection == null) {
            throw new IllegalStateException("Illegal request. Connection not established");
        }

        DatabaseMetaData md = connection.getMetaData();
        System.out.println("-- ResultSet Type --");
        System.out.println("Supports TYPE_FORWARD_ONLY: " + md.supportsResultSetType(ResultSet.TYPE_FORWARD_ONLY));
        System.out.println("Supports TYPE_SCROLL_INSENSITIVE: " + md.supportsResultSetType(ResultSet.TYPE_SCROLL_INSENSITIVE));
        System.out.println("Supports TYPE_SCROLL_SENSITIVE: " + md.supportsResultSetType(ResultSet.TYPE_SCROLL_SENSITIVE));
        System.out.println("-- ResultSet Concurrency --");
        System.out.println("Supports CONCUR_READ_ONLY: " + md.supportsResultSetType(ResultSet.CONCUR_READ_ONLY));
        System.out.println("Supports CONCUR_UPDATABLE: " + md.supportsResultSetType(ResultSet.CONCUR_UPDATABLE));
    }

//    public ResultSet executeQuery(String query) throws SQLException{
//        return statement.executeQuery(query);
//    }
//
//    public int executeUpdate(String query) throws SQLException {
//        return statement.executeUpdate(query);
//    }


//    public DBManager(String JDBC_driver, String JDBC_url) throws ClassNotFoundException, SQLException {
//        Class.forName(JDBC_driver);
//        connection = DriverManager.getConnection(JDBC_url);
//        statement = connection.createStatement();
//        statement.setQueryTimeout(30);
//        showMetadata();
//    }
//
//
//    public DBManager(String JDBC_driver, String JDBC_url,
//                     int resultSetType, int resultSetConcurrency) throws ClassNotFoundException, SQLException {
//        Class.forName(JDBC_driver);
//        connection = DriverManager.getConnection(JDBC_url);
//        statement = connection.createStatement(resultSetType, resultSetConcurrency);
//        statement.setQueryTimeout(30);
//        showMetadata();
//    }

    public static void close() throws SQLException {
        if (connection != null) {
            connection.close();
        }
    }
}

