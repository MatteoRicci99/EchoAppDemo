package com.example.echoapp.login;

import android.database.SQLException;
import com.example.echoapp.Utils;
import com.example.echoapp.database.DBManager;

import java.sql.*;

/**
 * Collegamento al database Login e convalida delle credenziali
**/
public class LoginManager {

    Statement statement;

    public LoginManager() throws SQLException, java.sql.SQLException {

        DBManager.setConnection(
                Utils.JDBC_Driver_SQLite,
                Utils.JDBC_URL_SQLite);
        statement = DBManager.getConnection().createStatement();

                /* MySQL connection
        DBManager.setConnection(
                Utils.JDBC_Driver_MySQL,
                Utils.JDBC_URL_MySQL);
        statement = DBManager.getConnection().createStatement(
                ResultSet.TYPE_SCROLL_SENSITIVE,
                ResultSet.CONCUR_UPDATABLE);
        */

        try {
            statement.executeQuery("SELECT * FROM Utente");
        } catch (SQLException e) {

        }

    }


    public boolean isValidate(String Email, String Password) throws SQLException, java.sql.SQLException {

        ResultSet resultSet = statement.executeQuery("SELECT * FROM Utente LIMIT 1");
        resultSet.last();

        if(resultSet.getString("Email") == Email
                && resultSet.getString("Password") == Password) {

            return true;
        }

        return false;
    }


}


//    public void testSelect() throws java.sql.SQLException {
//        ResultSet rs = statement.executeQuery("SELECT * FROM book LIMIT 100");
//        while (rs.next()) {
//            printRow(rs);
//        }
//    }
//
//    /**
//     * Update the content of the book table
//     */
//    public void testUpdate() throws java.sql.SQLException {
//        statement.executeUpdate(
//                "UPDATE book SET title='Il Principe', " + "author='Macchiavelli', " + "pages=176 " + "WHERE id=1");
//    }
//
//    /**
//     * Test Scrollable ResultSet
//     */
//    public void testScrollable() throws java.sql.SQLException {
//        ResultSet rs = statement.executeQuery("SELECT * FROM book LIMIT 100 OFFSET 0");
//        // Third record
//        rs.absolute(3);
//        printRow(rs);
//
//        // Previous record
//        rs.previous();
//        printRow(rs);
//
//        // +2 records from current position
//        rs.relative(2);
//        printRow(rs);
//    }
//
//    /**
//     * Test Updateable ResultSet Increment pages of one element
//     */
//    public void testUpdateable() throws java.sql.SQLException {
//        ResultSet rs = statement.executeQuery("SELECT * FROM book LIMIT 100 OFFSET 0");
//        while (rs.next()) {
//            int pages = rs.getInt("pages");
//            rs.updateInt("pages", pages + 1);
//            rs.updateRow();
//        }
//    }
//
//    /**
//     * Test Sensitive ResultSet
//     */
//    public void testSensitive() throws java.sql.SQLException {
//        ResultSet rs = statement.executeQuery("SELECT * FROM book LIMIT 100 OFFSET 0");
//        for (int retry = 0; retry < 10; retry++) {
//            while (rs.next()) {
//                rs.refreshRow();
//                printRow(rs);
//            }
//            System.out.printf("\n[%d] awaiting for external changes 6s...", retry);
//            try {
//                Thread.sleep(6000);
//            } catch (InterruptedException e) {
//                // do nothing
//            }
//            rs.beforeFirst();
//        }
//    }
//
//    /**
//     * Prints the current ResultSet row
//     */
//    public void printRow(ResultSet rs) throws java.sql.SQLException {
//        System.out.println("id=" + rs.getInt("id") + ", title=" + rs.getString("title") + ", author="
//                + rs.getString("author") + ", pages=" + rs.getInt("pages"));
//
//    }
