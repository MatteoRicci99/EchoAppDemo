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
